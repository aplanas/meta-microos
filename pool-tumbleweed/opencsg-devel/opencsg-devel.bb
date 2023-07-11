SUMMARY = "Development files for opencsg, a CSG rendering library"
DESCRIPTION = "OpenCSG is a library that does image-based Constructive Solid \
Geometry rendering using OpenGL. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of opencsg."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.1"

RPM_NAME = "opencsg-devel-1.5.1-1.4.aarch64.rpm"
RPM_HASH = "6a0b71565261bcf412c53d17ea4f368350167ab1bebad2f3de41e45a95f6173207d442bc2f6561192d4d0df8ac31c7615d574cdab71d61c7fbd79052da4c0804"

RPROVIDES:${PN} += "opencsg-devel"

RDEPENDS:${PN} += "freeglut-devel \
glew-devel \
libopencsg1"

inherit rpm
