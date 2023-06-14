SUMMARY = "3D racing game with ponies"
DESCRIPTION = "Pink Pony is a Tron­-like multiplayer racing­ game. You control \
little ponies that leave a trail of flowers everywhere they step. \
You have to evade these trails and force other ponies into them. \
The last pony standing wins the game."
LICENSE = "GPL-3.0+"

PV = "1.4.1"

RPM_NAME = "pink-pony-1.4.1-2.21.aarch64.rpm"
RPM_HASH = "7642a5685e23d47b53080ad563ce0877933aa1bb1325390177bfc78354af52bcc8b83c30e4eefad9e5978f095fc316e921c01abb3f5ce032dea13bf5d087aac9"

RPROVIDES:${PN} += "pink-pony"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libIL.so.1 \
libImath-3-1.so.29 \
libSDL-1.2.so.0 \
libSDL-mixer-1.2.so.0 \
libc.so.6 \
libftgl.so.2 \
libgcc-s.so.1 \
libglfw.so.2 \
libm.so.6 \
libprotobuf-3.21.12.so \
libsigc-2.0.so.0 \
libstdc++.so.6 \
pink-pony-data"

inherit rpm
