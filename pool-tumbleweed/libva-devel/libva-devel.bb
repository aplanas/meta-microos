SUMMARY = "Development files for the Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver. \
 \
 \
 \
 \
This package provides the development environment for libva packages."
LICENSE = "MIT"

PV = "2.19.0"

RPM_NAME = "libva-devel-2.19.0-1.1.aarch64.rpm"
RPM_HASH = "f00a4df2d4eec2dab7335f8e2aa22f730ba0055dcb3fc7a85feea587a037a4c60ee3f1cc4183ce60addb1a4f5dd5281d9da8094b881b0ab8e4d95c6c5967c4b0"

RPROVIDES:${PN} += "libva-devel \
pkgconfig-libva \
pkgconfig-libva-drm \
pkgconfig-libva-wayland \
pkgconfig-libva-x11"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libva-drm2 \
libva-wayland2 \
libva-x11-2 \
libva2 \
pkgconfig-libdrm \
pkgconfig-libva \
pkgconfig-wayland-client \
pkgconfig-x11 \
pkgconfig-xfixes"

inherit rpm
