SUMMARY = "A collection of game libraries"
DESCRIPTION = "Plib contains a selection of libraries that can be helpful for 3D game \
programming. It contains the following libraries: \
* JS  - A Joystick interface \
* PUI - A simple GUI built on top of OpenGL \
* SG  - Some Standard Geometry functions \
* SL  - A Games-oriented Sound Library \
* SSG - A Simple Scene Graph API built on top of OpenGL"
LICENSE = "LGPL-2.1-or-later"

PV = "1.8.5+svn.2173"

RPM_NAME = "libplib0-1.8.5+svn.2173-6.8.aarch64.rpm"
RPM_HASH = "f89a05ca340eb556ea0ee3f0e93067b607ac5c78ffb7b86a75ecaf279c05e9aff6dd500b4b76ca936b5c0ac0bd34bbfd90a8aa2e2aed9a03241c605dd8c52035"

RPROVIDES:${PN} += "libplib0 \
libplibfnt.so.0 \
libplibjs.so.0 \
libplibnet.so.0 \
libplibpsl.so.0 \
libplibpu.so.0 \
libplibpuaux.so.0 \
libplibpw.so.0 \
libplibsg.so.0 \
libplibsl.so.0 \
libplibsm.so.0 \
libplibssg.so.0 \
libplibssgaux.so.0 \
libplibul.so.0 \
plib"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
