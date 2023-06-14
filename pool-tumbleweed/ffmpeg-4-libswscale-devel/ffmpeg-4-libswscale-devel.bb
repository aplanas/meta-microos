SUMMARY = "Development files for FFmpeg's image scaling and colorspace library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations. \
 \
This subpackage contains the headers for FFmpeg libswscale."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libswscale-devel-4.4.4-1.2.aarch64.rpm"
RPM_HASH = "cbfa8e8ba0ea934a61988d81406aae42009714810b911569b1128e7bb5fdd18c2c40265ab0a943689d38bc5ba2af65d8c8666e566be4a30a52505bbfe10c2be3"

RPROVIDES:${PN} += "ffmpeg-4-libswscale-devel \
libswscale-devel \
pkgconfig-libswscale"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavutil-devel \
libswscale5-9 \
pkgconfig-libavutil"

inherit rpm
