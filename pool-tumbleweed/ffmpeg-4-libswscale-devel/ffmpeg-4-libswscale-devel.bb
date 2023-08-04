SUMMARY = "Development files for FFmpeg's image scaling and colorspace library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations. \
 \
This subpackage contains the headers for FFmpeg libswscale."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libswscale-devel-4.4.4-2.2.aarch64.rpm"
RPM_HASH = "727807b4242c793300963091cc075723e444b54eb7ce7b82befb12e38e90f0542f3f4f9323a6a1bc7c58921d8a6a7e9f16806cc41134bfb48451976736059608"

RPROVIDES:${PN} += "ffmpeg-4-libswscale-devel \
libswscale-devel \
pkgconfig-libswscale"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavutil-devel \
libswscale5-9 \
pkgconfig-libavutil"

inherit rpm
