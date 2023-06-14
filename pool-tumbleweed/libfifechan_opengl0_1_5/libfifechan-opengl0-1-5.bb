SUMMARY = "OpenGL extension library of the Fifechan GUI toolkit"
DESCRIPTION = "OpenGL extension for the fifechan library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.5"

RPM_NAME = "libfifechan_opengl0_1_5-0.1.5-1.19.aarch64.rpm"
RPM_HASH = "c3d9c05580dd04605fb5748552563854be0abb01800d7aec186bb58574cdc31f14b4ecfcb38820db7e04d00a61eb76e89c99f89e8070709e3bb1b670819e9da7"

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
