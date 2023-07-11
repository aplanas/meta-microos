SUMMARY = "RSS/Atom Feed Reader for Text Terminals"
DESCRIPTION = "Newsboat is an RSS/Atom feedreader. RSS and Atom are a number of \
widely-used XML formats to transmit, publish and syndicate articles, \
for example news or blog articles. Newsboat is designed to be used on \
text terminals."
LICENSE = "MIT"

PV = "2.32"

RPM_NAME = "newsboat-2.32-1.1.aarch64.rpm"
RPM_HASH = "2ee01367d0a492803533860b87bfd2928ea35082d2ee44601a04b3f3d1cfcb7f0f3f18b88c016cbf7ba6698d981da76e2b5c54f088b65b9d535fb6786aa94972"

RPROVIDES:${PN} += "newsbeuter \
newsboat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libjson-c.so.5 \
libncursesw.so.6 \
libsqlite3.so.0 \
libstdc++.so.6 \
libstfl.so.0 \
libtinfo.so.6 \
libxml2.so.2"

inherit rpm
