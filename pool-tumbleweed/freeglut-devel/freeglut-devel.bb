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

RPM_NAME = "freeglut-devel-3.2.2-1.8.aarch64.rpm"
RPM_HASH = "dde5d6011faf0ddfb126a1579f8cafb1590135d95c1306750e54088374643be29f7d1eecb25df160d2a744ef6ecb213603180898b08556c82cf3ed456fb63687"

RPROVIDES:${PN} += "cmake-FreeGLUT \
freeglut-devel \
mesaglut-devel \
pkgconfig-glut"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libglut3 \
pkgconfig-gl \
pkgconfig-glu"

inherit rpm
