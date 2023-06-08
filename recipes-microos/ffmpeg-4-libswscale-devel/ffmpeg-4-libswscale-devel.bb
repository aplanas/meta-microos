SUMMARY = "Development files for FFmpeg's image scaling and colorspace library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations. \
 \
This subpackage contains the headers for FFmpeg libswscale."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libswscale-devel-4.4.4-1.1.aarch64.rpm"
RPM_HASH = "bb1463974aa350dee12f6c3d86d83ece597a042c0b327c0f90c21bf0caa76e5746b55698efe54dfeb270920ec58c7a53aeed751b7da27d1390c4bf8adfaae991"

RPROVIDES:${PN} += "ffmpeg-4-libswscale-devel ffmpeg-4-libswscale-devel(aarch-64) libswscale-devel pkgconfig(libswscale)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-4-libavutil-devel libswscale5_9 pkgconfig(libavutil)"

inherit rpm
