SUMMARY = "Development files for opencsg, a CSG rendering library"
DESCRIPTION = "OpenCSG is a library that does image-based Constructive Solid \
Geometry rendering using OpenGL. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of opencsg."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.1"

RPM_NAME = "opencsg-devel-1.5.1-1.3.aarch64.rpm"
RPM_HASH = "75050703e7bcba7a4421db38f03a45ae3cf766dd9d8293ca7fe0f11e85b5ec7c42ed78ec235470dfcfe0a3c2e113358f81da0fe22cf3dd877cc8bdcec2307b40"

RPROVIDES:${PN} += "opencsg-devel"

RDEPENDS:${PN} += "freeglut-devel \
glew-devel \
libopencsg1"

inherit rpm
