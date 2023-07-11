SUMMARY = "A modern reimplementation of the game Duke Nukem II"
DESCRIPTION = "A modern reimplementation of the game Duke Nukem II, originally released in \
1993 for MS-DOS by Apogee Software. \
 \
You need the original game's data files in order to play, e.g. the freely \
available shareware version."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "RigelEngine-0.9.1-2.2.aarch64.rpm"
RPM_HASH = "fbbe72e5ffba5d161c38f5e1056c6f3f0c822e94898a80c5b9a0b19b65efb2b33868c9832c30e26ad8ab14eaa4af4d3f49345458d1fe3c389c3421e39c27b421"

RPROVIDES:${PN} += "RigelEngine"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
