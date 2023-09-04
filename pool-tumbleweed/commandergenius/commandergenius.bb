SUMMARY = "A clone of the Commander Keen engines"
DESCRIPTION = "Commander Genius is a software piece that interprets the Commander \
Keen Vorticon (1-3) and Galaxy (3½-6) series. \
 \
It has 4-player cooperative mode and six difficulty modes."
LICENSE = "GPL-2.0-only"

PV = "3.4.9"

RPM_NAME = "commandergenius-3.4.9-1.1.aarch64.rpm"
RPM_HASH = "87fd08aeabe7046ecd7209c2fdbcc26149ba48f8d8e99ef46855cffb732954cc58d598e9aec93b85f649b563b627405f7b97d082aab0df3fa5b93def1a4bb82c"

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
