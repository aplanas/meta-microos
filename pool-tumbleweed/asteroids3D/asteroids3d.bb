SUMMARY = "First-person shooter blowing up asteroids"
DESCRIPTION = "A simple first person shooter of blowing up asteroids in 3D space. \
The codebase also serves as an introduction to trigonometry and \
OpenGL."
LICENSE = "GPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "asteroids3D-1.0-1.3.aarch64.rpm"
RPM_HASH = "52fea18d564c11cdb92b4d617ed5b9cd59fbf7d28c9b46c781612662219d6450641b0e73a06b51a046612fea6684bf61bfd727df088b874ef7aabef331eb288a"

RPROVIDES:${PN} += "asteroids3D"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libc.so.6 \
libglut.so.3 \
libm.so.6"

inherit rpm
