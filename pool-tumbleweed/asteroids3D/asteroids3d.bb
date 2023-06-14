SUMMARY = "First-person shooter blowing up asteroids"
DESCRIPTION = "A simple first person shooter of blowing up asteroids in 3D space. \
The codebase also serves as an introduction to trigonometry and \
OpenGL."
LICENSE = "GPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "asteroids3D-1.0-1.2.aarch64.rpm"
RPM_HASH = "2f6e7166d6fc13cc4631329982f93e4f96584cc3eb176518928722bfa51f3c3a5f926e0a4fc849e3f07ec2dca6a37dedc3a989d4af0a582e55f4d9651fdf91d8"

RPROVIDES:${PN} += "asteroids3D"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libc.so.6 \
libglut.so.3 \
libm.so.6"

inherit rpm
