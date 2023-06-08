SUMMARY = "Development files for the FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing. \
 \
This subpackage contains the headers for FFmpeg libpostproc."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libpostproc-devel-6.0-2.1.aarch64.rpm"
RPM_HASH = "5c56fbf31704b6eef69c8dcac185971294d2fd19cc84c06558ded3ad8093c16e685a195a3fbbb3055664fbe947339744ae20f958afd5b92e17f8c33e5caa9b84"

RPROVIDES:${PN} += "ffmpeg-6-libpostproc-devel ffmpeg-6-libpostproc-devel(aarch-64) libpostproc-devel pkgconfig(libpostproc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-6-libavutil-devel libpostproc57 pkgconfig(libavutil)"

inherit rpm
