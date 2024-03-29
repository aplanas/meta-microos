SUMMARY = "3D Networked Multiplayer Tank Battle Game"
DESCRIPTION = "BZFlag is a 3D multiplayer tank battle game that allows users to play \
against each other in a networked environment. Because it makes heavy \
use of 3D graphics (OpenGL), a fast CPU or a supported 3D video card is \
heavily recommended. \
 \
Find server maps in /usr/share/bzflag/maps."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.26"

RPM_NAME = "bzflag-2.4.26-1.4.aarch64.rpm"
RPM_HASH = "6a42eba66d3b45042ec06b22e3f6b8ac7c85c936dd2b42954f271a9803784e641b0521e70c2bdaa7fd7c40d6f694efee77e0f5abc3b543a2c8273a644bd05544"

RPROVIDES:${PN} += "bzflag"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLEW.so.2.2 \
libGLU.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libcares.so.2 \
libcurl.so.4 \
libgcc-s.so.1 \
libm.so.6 \
libncurses.so.6 \
libstdc++.so.6 \
libtinfo.so.6 \
libz.so.1"

inherit rpm
