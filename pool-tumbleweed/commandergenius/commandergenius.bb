SUMMARY = "An open clone of the Commander Keen engines"
DESCRIPTION = "Commander Genius is a software piece that interprets the Commander \
Keen Vorticon (1-3) and Galaxy (3½-6) series. \
 \
It has 4-player cooperative mode and six difficulty modes."
LICENSE = "GPL-2.0-only"

PV = "3.4.0"

RPM_NAME = "commandergenius-3.4.0-1.1.aarch64.rpm"
RPM_HASH = "f443a692ebd09cfc97478e05cadcafbed62ed83e42daa360ad7c21e27661032c29f73d40952d75ffc4cf90ff6941d9acb6261c4bc01496e03b5c4f108f1e5ccb"

RPROVIDES:${PN} += "commandergenius"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
