SUMMARY = "2D motocross platform game"
DESCRIPTION = "X-Moto is a challenging 2D motocross platform game, where physics play \
an all important role in the gameplay. You need to control your bike to \
its limit, if you want to have a chance finishing the more difficult of \
the challenges.  First you'll try just to complete the levels, while \
later you'll compete with yourself and others, racing against the \
clock."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.2"

RPM_NAME = "xmoto-0.6.2-1.3.aarch64.rpm"
RPM_HASH = "c08e7ced4a94ffc484730da1bf40f69ae964bd2af75e498144818f0196c758e559090aff8a4e8480a21940af7e32a710077ce7b1af5ff4493acf53fc3a358ccb"

RPROVIDES:${PN} += "xmoto"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGLU.so.1 \
libOpenGL.so.0 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-net-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libbz2.so.1 \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libjpeg.so.8 \
liblua5.4.so.5 \
libm.so.6 \
libpng16.so.16 \
libsqlite3.so.0 \
libstdc++.so.6 \
libxml2.so.2 \
libz.so.1 \
xmoto-data"

inherit rpm
