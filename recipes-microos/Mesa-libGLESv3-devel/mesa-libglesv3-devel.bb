SUMMARY = "Development files for the OpenGL ES 3.x API"
DESCRIPTION = "OpenGL|ES is an API for full-function 2D and 3D \
graphics on embedded systems - including consoles, phones, appliances \
and vehicles. It contains a subset of OpenGL plus a number of \
extensions for the special needs of embedded systems. \
 \
This package provides a development environment for building \
applications using the OpenGL|ES 3.x APIs."
LICENSE = "MIT"

PV = "23.0.3"

RPM_NAME = "Mesa-libGLESv3-devel-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "f0cb972d9d7b838af71e18ebaa55d61bc67aba3e7e132afb965da509d966ce8a3f183b24f4fa0f4713bb6d7c2959b9573c3c67470ed42173640c8d2d381cf001"

RPROVIDES:${PN} += "Mesa-libGLESv3-devel \
Mesa-libGLESv3-devel(aarch-64)"
RDEPENDS:${PN} += "Mesa-KHR-devel \
pkgconfig(egl)"

inherit rpm
