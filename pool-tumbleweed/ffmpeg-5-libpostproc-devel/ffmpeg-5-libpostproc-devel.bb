SUMMARY = "Development files for the FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing. \
 \
This subpackage contains the headers for FFmpeg libpostproc."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libpostproc-devel-5.1.3-1.2.aarch64.rpm"
RPM_HASH = "df4cd309fd17371ceb895ed5dbe7b41015c622d69e5fd086127a5ca09ea5077f8f3a096cd7b7766671d62aed09133e20c60ccb81b234af5f6d80d2d8465b7bb1"

RPROVIDES:${PN} += "ffmpeg-5-libpostproc-devel \
ffmpeg-5-libpostproc-devel(aarch-64) \
libpostproc-devel \
pkgconfig(libpostproc)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-5-libavutil-devel \
libpostproc56 \
pkgconfig(libavutil)"

inherit rpm
