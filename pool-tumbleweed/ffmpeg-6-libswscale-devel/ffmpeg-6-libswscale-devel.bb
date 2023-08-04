SUMMARY = "Development files for FFmpeg's image scaling and colorspace library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations. \
 \
This subpackage contains the headers for FFmpeg libswscale."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libswscale-devel-6.0-3.1.aarch64.rpm"
RPM_HASH = "d346b96261b45af280292d00e593fd22118a948dcd1a29dd8315cc2d3a7ae2e2cb940415450e757be50cad7d0be09c7fdffdf6e0831b3d21a8140d60918c69b2"

RPROVIDES:${PN} += "ffmpeg-6-libswscale-devel \
libswscale-devel \
pkgconfig-libswscale"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-6-libavutil-devel \
libswscale7 \
pkgconfig-libavutil"

inherit rpm
