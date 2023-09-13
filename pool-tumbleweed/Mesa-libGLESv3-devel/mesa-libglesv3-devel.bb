SUMMARY = "Development files for the OpenGL ES 3.x API"
DESCRIPTION = "OpenGL|ES is an API for full-function 2D and 3D \
graphics on embedded systems - including consoles, phones, appliances \
and vehicles. It contains a subset of OpenGL plus a number of \
extensions for the special needs of embedded systems. \
 \
This package provides a development environment for building \
applications using the OpenGL|ES 3.x APIs."
LICENSE = "MIT"

PV = "23.1.7"

RPM_NAME = "Mesa-libGLESv3-devel-23.1.7-357.1.aarch64.rpm"
RPM_HASH = "f7f2529a3a6eafb6ea889e73bcc87e1e32fa1f819f2f8ec35ec29389bf6daee5d3358bd654bb9bb4ff065aa011e4a1c1a9e2cdbd74bd59da3ca1718886f91f63"

RPROVIDES:${PN} += "Mesa-libGLESv3-devel"

RDEPENDS:${PN} += "Mesa-KHR-devel \
pkgconfig-egl"

inherit rpm
