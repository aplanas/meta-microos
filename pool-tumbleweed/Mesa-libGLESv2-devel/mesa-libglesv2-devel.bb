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

PV = "23.1.3"

RPM_NAME = "Mesa-libGLESv2-devel-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "9bae300782079e40ecf28ef372ec1637fc6eaa526d138dd3e5c492a16c6eca8d3bcae4a6a7d94d1114d5a3c7276b89e39af7ab9cac2585a505c37fe1d7448fdd"

RPROVIDES:${PN} += "Mesa-libGLESv2-devel \
pkgconfig-glesv2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
libglvnd-devel \
pkgconfig-egl"

inherit rpm
