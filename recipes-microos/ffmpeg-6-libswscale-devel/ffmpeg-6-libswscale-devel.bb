SUMMARY = "Development files for FFmpeg's image scaling and colorspace library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations. \
 \
This subpackage contains the headers for FFmpeg libswscale."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libswscale-devel-6.0-2.2.aarch64.rpm"
RPM_HASH = "44b3201aadb02683d32a1fb2687cab20bedb6d216db591e996dcb08c0bad6caa8f55b8cb381b5e6a046a3f90ade4dbd889b5cd0f1dad6ab1c6dac6e269f6623e"

RPROVIDES:${PN} += "ffmpeg-6-libswscale-devel ffmpeg-6-libswscale-devel(aarch-64) libswscale-devel pkgconfig(libswscale)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-6-libavutil-devel libswscale7 pkgconfig(libavutil)"

inherit rpm
