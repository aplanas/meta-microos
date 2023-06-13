SUMMARY = "Development libraries, includes and man pages for freeglut (GLUT Library)"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and link applications for the freeglut library. \
 \
In addition, it also includes manual pages which describe all functions \
provided by the freeglut library. \
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

RPM_NAME = "freeglut-devel-3.2.2-1.7.aarch64.rpm"
RPM_HASH = "ed1869da9639e6d4059dabe6e70589387c7bdc5b8443de618e2abd7027a5a37c06580a3014d0cb87052365f62fc757bcfe81fa3ffda185f83df201e281b9eb07"

RPROVIDES:${PN} += "cmake(FreeGLUT) \
freeglut-devel \
freeglut-devel(aarch-64) \
mesaglut-devel \
pkgconfig(glut)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libglut3 \
pkgconfig(gl) \
pkgconfig(glu)"

inherit rpm
