SUMMARY = "A Bomberman clone"
DESCRIPTION = "This is an SDL2 version of the original 1999 version of Mr. Boom. \
The goal of the game is to bomb away enemies and other players."
LICENSE = "MIT"

PV = "4.9"

RPM_NAME = "mrboom-4.9-1.15.aarch64.rpm"
RPM_HASH = "54660543dded1f30b068393c8abd714de404896c4edd19fda08722a6b762cbf42347ec952249a4d56ff28f162262c66138d3938fa77838bdaa8df20aca25f304"

RPROVIDES:${PN} += "mrboom"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libc.so.6 \
libgcc-s.so.1 \
libminizip.so.1 \
libstdc++.so.6"

inherit rpm
