SUMMARY = "Development files for the OpenGL ES 2.x API"
DESCRIPTION = "OpenGL|ES is an API for full-function 2D and 3D \
graphics on embedded systems - including consoles, phones, appliances \
and vehicles. It contains a subset of OpenGL plus a number of \
extensions for the special needs of embedded systems. \
 \
OpenGL|ES 2.x provides an API for programmable hardware including \
vertex and fragment shaders. \
 \
This package provides a development environment for building \
applications using the OpenGL|ES 2.x APIs."
LICENSE = "MIT"

PV = "23.1.4"

RPM_NAME = "Mesa-libGLESv2-devel-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "38d979543c6765de4a427759338bf4b74d1b158d834ebde51744834ab4a6062f1b70ef4dda27327d63602d4594f96379c9b1cb05fa3e9c427aabbb24ca095624"

RPROVIDES:${PN} += "Mesa-libGLESv2-devel \
pkgconfig-glesv2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
libglvnd-devel \
pkgconfig-egl"

inherit rpm
