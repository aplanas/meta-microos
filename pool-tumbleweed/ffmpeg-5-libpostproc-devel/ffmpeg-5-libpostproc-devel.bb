SUMMARY = "Development files for the FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing. \
 \
This subpackage contains the headers for FFmpeg libpostproc."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libpostproc-devel-5.1.3-2.1.aarch64.rpm"
RPM_HASH = "0533f99973608c33e9460703aa03a4a7b11a4bbe17dcc52ed6b7ac6a3bcbd31ac02403143f0e2c8b13172fd5c88804828c6dde0e313826791897715fc587edfc"

RPROVIDES:${PN} += "ffmpeg-5-libpostproc-devel \
libpostproc-devel \
pkgconfig-libpostproc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-5-libavutil-devel \
libpostproc56 \
pkgconfig-libavutil"

inherit rpm
