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

PV = "23.1.4"

RPM_NAME = "Mesa-libGLESv1_CM-devel-23.1.4-354.1.aarch64.rpm"
RPM_HASH = "79147846a2338ecb8fb2c64f393a6e9d7b69e437512f15bc7e97bdb3eb553f7fa28f185d6c5974a93abe6ac308725f0dec6adfadd4d9a1d33cc617c54b36a8ea"

RPROVIDES:${PN} += "Mesa-libGLESv1-CM-devel \
pkgconfig-glesv1-cm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
libglvnd-devel \
pkgconfig-egl"

inherit rpm
