SUMMARY = "Development files for FFmpeg's image scaling and colorspace library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations. \
 \
This subpackage contains the headers for FFmpeg libswscale."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libswscale-devel-6.0-2.1.aarch64.rpm"
RPM_HASH = "d7e6061adcd4fb34c97b95474ef80d2382a2811dadd1208025658df6214db07ebe0acd181f6c4f73df68e1b78bcc089e2aa0d96d42e02f9624aca147d80d67ac"

RPROVIDES:${PN} += "ffmpeg-6-libswscale-devel ffmpeg-6-libswscale-devel(aarch-64) libswscale-devel pkgconfig(libswscale)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-6-libavutil-devel libswscale7 pkgconfig(libavutil)"

inherit rpm
