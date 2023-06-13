SUMMARY = "Demonstration applications for the freeglut library"
DESCRIPTION = "This package contains demonstration applications for the freeglut library. \
 \
Freeglut is a completely open source alternative to the OpenGL Utility \
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

RPM_NAME = "freeglut-demo-3.2.2-1.7.aarch64.rpm"
RPM_HASH = "aa6e1a8dc4a220bb767a83e4430abea840119d53bf94d7fc518d36c8eb89614be1e317ad96b91974578e29b1870737f1429c3322558451a5c1206a6387d7039a"

RPROVIDES:${PN} += "freeglut-demo \
freeglut-demo(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglut.so.3()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
