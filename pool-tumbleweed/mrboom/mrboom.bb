SUMMARY = "A Bomberman clone"
DESCRIPTION = "This is an SDL2 version of the original 1999 version of Mr. Boom. \
The goal of the game is to bomb away enemies and other players."
LICENSE = "MIT"

PV = "4.9"

RPM_NAME = "mrboom-4.9-1.16.aarch64.rpm"
RPM_HASH = "ff8b7f6025dd51fc39015525c65a595c3d3fa47be47d9f3f0d8d775c259dfe34d31c6513211375cf10089b0fbbc2c689d1a01170732335267d87b78e9fbfe2c4"

RPROVIDES:${PN} += "mrboom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libminizip.so.1 \
libstdc++.so.6"

inherit rpm
