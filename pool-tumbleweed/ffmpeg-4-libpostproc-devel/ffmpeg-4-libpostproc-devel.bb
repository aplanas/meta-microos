SUMMARY = "Development files for the FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing. \
 \
This subpackage contains the headers for FFmpeg libpostproc."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libpostproc-devel-4.4.4-2.2.aarch64.rpm"
RPM_HASH = "be86a7e26c0ebd667ba234e93943063da032e01176eb3f8e90b7e1e7279ad39a6b6483bcb1c90b69f6da048eb086e2f94bb99ba556b9b7f1bb71f9851908dc94"

RPROVIDES:${PN} += "ffmpeg-4-libpostproc-devel \
libpostproc-devel \
pkgconfig-libpostproc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavutil-devel \
libpostproc55-9 \
pkgconfig-libavutil"

inherit rpm
