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

PV = "23.1.7"

RPM_NAME = "Mesa-libGLESv2-devel-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "bda151f3a39f0aa25225378c38d20e2c4341357ce88e183ad1e48a7ae91387a31d274bdd5887594033fdbf83f4165e9f197ce049cb7fcf1ae830ba38b6f743c9"

RPROVIDES:${PN} += "Mesa-libGLESv2-devel \
pkgconfig-glesv2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
libglvnd-devel \
pkgconfig-egl"

inherit rpm
