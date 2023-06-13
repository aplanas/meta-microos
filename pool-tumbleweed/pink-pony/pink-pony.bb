SUMMARY = "3D racing game with ponies"
DESCRIPTION = "Pink Pony is a Tron­-like multiplayer racing­ game. You control \
little ponies that leave a trail of flowers everywhere they step. \
You have to evade these trails and force other ponies into them. \
The last pony standing wins the game."
LICENSE = "GPL-3.0+"

PV = "1.4.1"

RPM_NAME = "pink-pony-1.4.1-2.21.aarch64.rpm"
RPM_HASH = "7642a5685e23d47b53080ad563ce0877933aa1bb1325390177bfc78354af52bcc8b83c30e4eefad9e5978f095fc316e921c01abb3f5ce032dea13bf5d087aac9"

RPROVIDES:${PN} += "application() \
application(pink-pony.desktop) \
pink-pony \
pink-pony(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libIL.so.1()(64bit) \
libImath-3_1.so.29()(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_mixer-1.2.so.0()(64bit) \
libc.so.6()(64bit) \
libftgl.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libglfw.so.2()(64bit) \
libm.so.6()(64bit) \
libprotobuf-3.21.12.so()(64bit) \
libsigc-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit) \
pink-pony-data"

inherit rpm
