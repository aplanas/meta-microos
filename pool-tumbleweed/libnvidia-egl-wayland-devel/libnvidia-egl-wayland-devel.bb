SUMMARY = "Development package for libnvidia-egl-wayland"
DESCRIPTION = "This is an implementation of a EGL External Platform library to add client-side \
Wayland support to EGL on top of EGLDevice and EGLStream families of extensions. \
 \
This library implements an EGL External Platform interface to work along with \
EGL drivers that support the external platform mechanism. \
 \
This package provides headers and libraries required to build software \
using libnvidia-egl-wayland."
LICENSE = "MIT"

PV = "1.1.12"

RPM_NAME = "libnvidia-egl-wayland-devel-1.1.12-1.1.aarch64.rpm"
RPM_HASH = "36d45e7cd3125172b580df7d065e83b57780078b76d0d6e81bfcc68e4cb216113b703b30c3465c945ec4aafbc48e29b76c0886348f7d00713d18f5ff56ef3e19"

RPROVIDES:${PN} += "libnvidia-egl-wayland-devel \
pkgconfig-wayland-eglstream \
pkgconfig-wayland-eglstream-protocols"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnvidia-egl-wayland1 \
pkgconfig-eglexternalplatform"

inherit rpm
