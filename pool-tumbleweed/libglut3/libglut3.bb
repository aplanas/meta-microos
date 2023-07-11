SUMMARY = "Freely licensed alternative to the GLUT library"
DESCRIPTION = "Freeglut is a completely open source alternative to the OpenGL Utility \
Toolkit (GLUT) library. GLUT was originally written by Mark Kilgard to \
support the sample programs in the second edition OpenGL Redbook. Since \
then, GLUT has been used in a wide variety of practical applications \
because it is simple, universally available, and highly portable. \
 \
GLUT (and freeglut) allow the user to create and manage windows \
containing OpenGL contexts and also read the mouse, keyboard, and \
joystick functions on a wide range of platforms."
LICENSE = "MIT"

PV = "3.2.2"

RPM_NAME = "libglut3-3.2.2-1.8.aarch64.rpm"
RPM_HASH = "b2d4da171b75eb8f8b87fb513c020d801bf907abbe84a751651e22fa474d39e6550f9a87c9be0cc6177ad8585998408fc5aeb1941160e4096ec7f9b555e11cd5"

RPROVIDES:${PN} += "libglut.so.3 \
libglut3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXi.so.6 \
libXrandr.so.2 \
libXxf86vm.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
