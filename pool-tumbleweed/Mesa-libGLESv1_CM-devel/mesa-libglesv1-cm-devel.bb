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

PV = "23.1.5"

RPM_NAME = "Mesa-libGLESv1_CM-devel-23.1.5-355.1.aarch64.rpm"
RPM_HASH = "551e9cc50aaf95b24dbfddc8b80e40da0b0639704c311ab50cafccc055fdea87eafedbfec941e60d029d2efd179e8f4e578d44de4badb0f31f66ed216df01eda"

RPROVIDES:${PN} += "Mesa-libGLESv1-CM-devel \
pkgconfig-glesv1-cm"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
Mesa-KHR-devel \
libglvnd-devel \
pkgconfig-egl"

inherit rpm
