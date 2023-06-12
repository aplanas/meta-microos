SUMMARY = "Development files for the FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing. \
 \
This subpackage contains the headers for FFmpeg libpostproc."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libpostproc-devel-6.0-2.2.aarch64.rpm"
RPM_HASH = "14e357feebd82a8c3df8a4011e2b6c14ec50f261bbea3573dcd70dd1957c3c16631be5ba765edb1725613425406920d7e44efe0c10e28baedfc2af5d3badd69d"

RPROVIDES:${PN} += "ffmpeg-6-libpostproc-devel \
ffmpeg-6-libpostproc-devel(aarch-64) \
libpostproc-devel \
pkgconfig(libpostproc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-6-libavutil-devel \
libpostproc57 \
pkgconfig(libavutil)"

inherit rpm
