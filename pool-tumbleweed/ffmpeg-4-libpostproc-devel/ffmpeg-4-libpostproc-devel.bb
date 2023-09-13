SUMMARY = "Development files for the FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing. \
 \
This subpackage contains the headers for FFmpeg libpostproc."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libpostproc-devel-4.4.4-2.3.aarch64.rpm"
RPM_HASH = "46dc0b3daa817d934deea0be5fec60216c8947c99e075d8bff8332f4593632506cf00085be8ccdee14375339adcedc00f89014353d6deb0094f80539b7359933"

RPROVIDES:${PN} += "ffmpeg-4-libpostproc-devel \
libpostproc-devel \
pkgconfig-libpostproc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavutil-devel \
libpostproc55-9 \
pkgconfig-libavutil"

inherit rpm
