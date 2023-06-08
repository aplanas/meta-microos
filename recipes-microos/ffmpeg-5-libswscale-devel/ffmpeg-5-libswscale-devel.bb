SUMMARY = "Development files for FFmpeg's image scaling and colorspace library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations. \
 \
This subpackage contains the headers for FFmpeg libswscale."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libswscale-devel-5.1.3-1.1.aarch64.rpm"
RPM_HASH = "0497c13c3988c69d852c7ce57d588afffcc20a1194b461839c3f00b180ab1ce4b1b93f9dc406bf5e9e72e70b8158dd5a3331e3de182da2e4e771c424d0d0d5d3"

RPROVIDES:${PN} += "ffmpeg-5-libswscale-devel ffmpeg-5-libswscale-devel(aarch-64) libswscale-devel pkgconfig(libswscale)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-5-libavutil-devel libswscale6 pkgconfig(libavutil)"

inherit rpm
