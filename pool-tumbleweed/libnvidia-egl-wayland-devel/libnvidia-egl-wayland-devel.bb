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

PV = "1.1.11"

RPM_NAME = "libnvidia-egl-wayland-devel-1.1.11-1.2.aarch64.rpm"
RPM_HASH = "050d5a433b7400aaaef008a9a4ae560c447861b64560512f62be593d402224fe7357cb546179b386557e9e24903103287dc6275ba8e0ff196096ad58dd5ffb36"

RPROVIDES:${PN} += "libnvidia-egl-wayland-devel \
pkgconfig-wayland-eglstream \
pkgconfig-wayland-eglstream-protocols"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnvidia-egl-wayland1 \
pkgconfig-eglexternalplatform"

inherit rpm
