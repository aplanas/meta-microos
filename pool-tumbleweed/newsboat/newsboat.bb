SUMMARY = "RSS/Atom Feed Reader for Text Terminals"
DESCRIPTION = "Newsboat is an RSS/Atom feedreader. RSS and Atom are a number of \
widely-used XML formats to transmit, publish and syndicate articles, \
for example news or blog articles. Newsboat is designed to be used on \
text terminals."
LICENSE = "MIT"

PV = "2.31"

RPM_NAME = "newsboat-2.31-1.1.aarch64.rpm"
RPM_HASH = "d13a79330c18739b8980ce64674bd3ae62978f7d0a3fcc5165d319de4da5fc06c895f7d0b42e94fec050a7ca055204cc7369134a4d09e3185bb3565b6cf9264e"

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
