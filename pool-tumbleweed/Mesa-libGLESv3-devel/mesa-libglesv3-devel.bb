SUMMARY = "Development files for the OpenGL ES 3.x API"
DESCRIPTION = "OpenGL|ES is an API for full-function 2D and 3D \
graphics on embedded systems - including consoles, phones, appliances \
and vehicles. It contains a subset of OpenGL plus a number of \
extensions for the special needs of embedded systems. \
 \
This package provides a development environment for building \
applications using the OpenGL|ES 3.x APIs."
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "Mesa-libGLESv3-devel-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "044f75bc338f7ac38865061ca2f45f83f08a1a6406c2f3e328ce01bc4bd20c69f441e76e138b7156f2b280c8486858b6b228e21a590c3e9171eafe6f43d36081"

RPROVIDES:${PN} += "Mesa-libGLESv3-devel"

RDEPENDS:${PN} += "Mesa-KHR-devel \
pkgconfig-egl"

inherit rpm
