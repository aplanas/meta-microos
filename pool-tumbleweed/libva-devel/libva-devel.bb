SUMMARY = "Development files for the Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver. \
 \
 \
 \
 \
This package provides the development environment for libva packages."
LICENSE = "MIT"

PV = "2.18.0"

RPM_NAME = "libva-devel-2.18.0-2.2.aarch64.rpm"
RPM_HASH = "d711344100abcbc90d4bc9a10cd61e7717467e37e09e6e813c3a09b202a55856baf94cabe426340a451cec67f255261eb3543f513eaf279ceef6deb48b0a253d"

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
