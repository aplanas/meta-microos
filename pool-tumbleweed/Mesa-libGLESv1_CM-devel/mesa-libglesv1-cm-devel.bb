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

PV = "23.1.6"

RPM_NAME = "Mesa-libGLESv1_CM-devel-23.1.6-356.1.aarch64.rpm"
RPM_HASH = "3c38c60582fdb2e9f7f8120bb0157061252568880107f0f00e79800782c44a568b84a669c5d4f966cda6f3081e7e3e0e01c9a9d2c918b5e488d33cb3c76f2cf3"

RPROVIDES:${PN} += "Mesa-libGLESv1-CM-devel \
pkgconfig-glesv1-cm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
libglvnd-devel \
pkgconfig-egl"

inherit rpm
