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

RPM_NAME = "freeglut-demo-3.2.2-1.8.aarch64.rpm"
RPM_HASH = "964ee7c049e1a3af1693968ef98b8e5654bb708554af3ec47eca58d8628cfe8ba8e7e24dc76e8a92fcbaad17256ff69ed9cbbbc7dd68e92ba9f57c45bed1b7b2"

RPROVIDES:${PN} += "freeglut-demo"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libc.so.6 \
libglut.so.3 \
libm.so.6"

inherit rpm
