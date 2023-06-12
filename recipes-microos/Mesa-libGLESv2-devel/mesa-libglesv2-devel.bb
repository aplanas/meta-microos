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

PV = "23.0.3"

RPM_NAME = "Mesa-libGLESv2-devel-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "3ccb4fcf5143adf5b2ada44f231501d8119ffb61ca9d59946af31e4ac9d13b0867dd0e5c910e90d21c34aef562c5ac442b566add5f9c20763c0502b0731813a0"

RPROVIDES:${PN} += "Mesa-libGLESv2-devel \
Mesa-libGLESv2-devel(aarch-64) \
pkgconfig(glesv2)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
libglvnd-devel \
pkgconfig(egl)"

inherit rpm
