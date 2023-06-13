SUMMARY = "Development files for the X-Video Motion Compensation library"
DESCRIPTION = "X-Video Motion Compensation (XvMC), is an extension of the X video \
extension (Xv) for the X Window System. The XvMC API allows video \
programs to offload portions of the video decoding process to the GPU \
video-hardware. \
 \
This package contains the development headers for the library found \
in libXvMC1."
LICENSE = "MIT"

PV = "1.0.13"

RPM_NAME = "libXvMC-devel-1.0.13-1.6.aarch64.rpm"
RPM_HASH = "46c7aa1840380c11b8843161cd9d836eebf9dac29f2bf1980ea94ff32480eb4c8c12f4f897d90d56f6ba1435dc8166b7e237f5c0ad3a4a5516a12a3fe13f957b"

RPROVIDES:${PN} += "libXvMC-devel \
libXvMC-devel(aarch-64) \
pkgconfig(xvmc) \
pkgconfig(xvmc-wrapper) \
xorgproto-devel:/usr/include/X11/extensions/vldXvMC.h"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libXvMC1 \
pkgconfig(videoproto) \
pkgconfig(x11) \
pkgconfig(xext) \
pkgconfig(xextproto) \
pkgconfig(xv)"

inherit rpm
