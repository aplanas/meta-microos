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

PV = "23.1.3"

RPM_NAME = "Mesa-libGLESv1_CM-devel-23.1.3-353.1.aarch64.rpm"
RPM_HASH = "503966df4f588954273b61a455b764035b985f27623d562c45bc9124e57374c3cc2aff62874963daabf9d21bb0b7719eafd43d666007f70a70e2a6b2295587f1"

RPROVIDES:${PN} += "Mesa-libGLESv1-CM-devel \
pkgconfig-glesv1-cm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
libglvnd-devel \
pkgconfig-egl"

inherit rpm
