SUMMARY = "Development files for the OpenGL ES 1.x API"
DESCRIPTION = "OpenGL|ES is an API for full-function 2D and 3D \
graphics on embedded systems - including consoles, phones, appliances \
and vehicles. It contains a subset of OpenGL plus a number of \
extensions for the special needs of embedded systems. \
 \
OpenGL|ES 1.x provides an API for fixed-function hardware. \
 \
This package provides a development environment for building programs \
using the OpenGL|ES 1.x APIs."
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "Mesa-libGLESv1_CM-devel-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "04a12a1db2420ab0ebf269d3ca9e6af50f1bb0fb47185ead80dc91ffb2da20c67d39a702bb8d8e9bdcc1dcfdaa1d0e0a2c457d9642c3c33ea6e82f59298e829e"

RPROVIDES:${PN} += "Mesa-libGLESv1-CM-devel \
pkgconfig-glesv1-cm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
libglvnd-devel \
pkgconfig-egl"

inherit rpm
