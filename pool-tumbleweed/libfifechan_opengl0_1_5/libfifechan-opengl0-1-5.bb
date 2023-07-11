SUMMARY = "OpenGL extension library of the Fifechan GUI toolkit"
DESCRIPTION = "OpenGL extension for the fifechan library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.5"

RPM_NAME = "libfifechan_opengl0_1_5-0.1.5-1.20.aarch64.rpm"
RPM_HASH = "393c46edd02b59c9079f02f9122ed3b9dd771110e0fd2c91e7568ab5082bcc04c78b81ea74ef77ccb43cfbd34f75f4b1ccf16d7435bf4131bcab4253d815e0d7"

RPROVIDES:${PN} += "libfifechan-opengl.so.0.1.5 \
libfifechan-opengl0-1-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libc.so.6 \
libfifechan.so.0.1.5 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
