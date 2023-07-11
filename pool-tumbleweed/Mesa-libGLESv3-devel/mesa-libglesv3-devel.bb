SUMMARY = "Development files for the OpenGL ES 3.x API"
DESCRIPTION = "OpenGL|ES is an API for full-function 2D and 3D \
graphics on embedded systems - including consoles, phones, appliances \
and vehicles. It contains a subset of OpenGL plus a number of \
extensions for the special needs of embedded systems. \
 \
This package provides a development environment for building \
applications using the OpenGL|ES 3.x APIs."
LICENSE = "MIT"

PV = "23.1.3"

RPM_NAME = "Mesa-libGLESv3-devel-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "51d1c20b3d298cf277dd6c70b39af91278b683248dd70a5bd3e09cc3a7ef4d62a4d42b78a906e973db1ff53d2187a67aab2199e7c74b70ce38bb21c6c8e210fb"

RPROVIDES:${PN} += "Mesa-libGLESv3-devel"

RDEPENDS:${PN} += "Mesa-KHR-devel \
pkgconfig-egl"

inherit rpm
