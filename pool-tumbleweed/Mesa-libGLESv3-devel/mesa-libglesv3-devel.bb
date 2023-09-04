SUMMARY = "Development files for the OpenGL ES 3.x API"
DESCRIPTION = "OpenGL|ES is an API for full-function 2D and 3D \
graphics on embedded systems - including consoles, phones, appliances \
and vehicles. It contains a subset of OpenGL plus a number of \
extensions for the special needs of embedded systems. \
 \
This package provides a development environment for building \
applications using the OpenGL|ES 3.x APIs."
LICENSE = "MIT"

PV = "23.1.5"

RPM_NAME = "Mesa-libGLESv3-devel-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "5501857287cd79bb6f6b08ae318958e104f86947df096bf2041588b628b7bd97b4c36957b41900706f51eec398b599f4e7861a5a42351b200872adcf4711d905"

RPROVIDES:${PN} += "Mesa-libGLESv3-devel"

RDEPENDS:${PN} += "Mesa-KHR-devel \
pkgconfig-egl"

inherit rpm
