SUMMARY = "Framework for browsing and searching media content -- Playlist Helper Library"
DESCRIPTION = "Grilo is a framework for browsing and searching media content from \
various sources using a single API."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.16"

RPM_NAME = "libgrlpls-0_3-0-0.3.16-1.1.aarch64.rpm"
RPM_HASH = "1a7c8f394fcc44bbff0aae59314c95556bc7745b95198c9094c7672ac2896d1eabb12bba7b9d0da747d43cb6e8cb39407bad0d4767c229581f1a9ad6a9e317ef"

RPROVIDES:${PN} += "libgrlpls-0-3-0 \
libgrlpls-0.3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgrilo-0.3.so.0 \
libtotem-plparser.so.18"

inherit rpm
