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
libplib0(aarch-64) \
libplibfnt.so.0()(64bit) \
libplibjs.so.0()(64bit) \
libplibnet.so.0()(64bit) \
libplibpsl.so.0()(64bit) \
libplibpu.so.0()(64bit) \
libplibpuaux.so.0()(64bit) \
libplibpw.so.0()(64bit) \
libplibsg.so.0()(64bit) \
libplibsl.so.0()(64bit) \
libplibsm.so.0()(64bit) \
libplibssg.so.0()(64bit) \
libplibssgaux.so.0()(64bit) \
libplibul.so.0()(64bit) \
plib"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
