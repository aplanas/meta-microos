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

PV = "23.0.3"

RPM_NAME = "Mesa-libGLESv1_CM-devel-23.0.3-349.1.aarch64.rpm"
RPM_HASH = "f7c705fb227db0399dae9f39c88168b0fc8f55e0fc17d80bdbd4ac7952742b5e29fa79ffca7ab8640d65402f8ce61c7923f13238499b40b1d7ade4e084d2a810"

RPROVIDES:${PN} += "Mesa-libGLESv1_CM-devel \
Mesa-libGLESv1_CM-devel(aarch-64) \
pkgconfig(glesv1_cm)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
libglvnd-devel \
pkgconfig(egl)"

inherit rpm
