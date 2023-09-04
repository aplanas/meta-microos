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

PV = "23.1.5"

RPM_NAME = "Mesa-libGLESv2-devel-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "6e4c56af7f6b7d9af622907e1491fbb42f1ea16816767812ee9c4eeb03f0b2e444361210b183ca41194b868a4c7b43e347c22bdd093543e4f57ee92f9dfa594f"

RPROVIDES:${PN} += "Mesa-libGLESv2-devel \
pkgconfig-glesv2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
libglvnd-devel \
pkgconfig-egl"

inherit rpm
