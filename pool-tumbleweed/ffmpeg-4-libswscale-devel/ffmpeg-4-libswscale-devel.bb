SUMMARY = "Development files for FFmpeg's image scaling and colorspace library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations. \
 \
This subpackage contains the headers for FFmpeg libswscale."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libswscale-devel-4.4.4-2.1.aarch64.rpm"
RPM_HASH = "c919d4c4bb34e7c1323d82ff6ee03a71271407cdf5af3dfe5950775b6e3862629ecd69f3ff10a32822fd2aad23412affcdf398a4c9ab5b17f4dcc8fc93b15226"

RPROVIDES:${PN} += "ffmpeg-4-libswscale-devel \
libswscale-devel \
pkgconfig-libswscale"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavutil-devel \
libswscale5-9 \
pkgconfig-libavutil"

inherit rpm
