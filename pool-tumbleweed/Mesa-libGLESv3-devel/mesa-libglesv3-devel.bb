SUMMARY = "Development files for the OpenGL ES 3.x API"
DESCRIPTION = "OpenGL|ES is an API for full-function 2D and 3D \
graphics on embedded systems - including consoles, phones, appliances \
and vehicles. It contains a subset of OpenGL plus a number of \
extensions for the special needs of embedded systems. \
 \
This package provides a development environment for building \
applications using the OpenGL|ES 3.x APIs."
LICENSE = "MIT"

PV = "23.1.6"

RPM_NAME = "Mesa-libGLESv3-devel-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "149b35af5295ad9db3fe9cd1933d8939d4ee3ab11e1bbe59ed5a5597467954f9d6306c8ac370bc7b9ccd609ccd81eb5d4c56f8b5c58f3f6797486548826fe7a7"

RPROVIDES:${PN} += "Mesa-libGLESv3-devel"

RDEPENDS:${PN} += "Mesa-KHR-devel \
pkgconfig-egl"

inherit rpm
