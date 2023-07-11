SUMMARY = "Development files for the FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing. \
 \
This subpackage contains the headers for FFmpeg libpostproc."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libpostproc-devel-4.4.4-2.1.aarch64.rpm"
RPM_HASH = "852641967292c691b65e7b84283d9fb2dc084b85a96b3948330a4b9c1e4d0f43fd864f7de410c2a154d50f3bf62e88f7453a7620b8aafa3baa56cfefc8fa2f5a"

RPROVIDES:${PN} += "ffmpeg-4-libpostproc-devel \
libpostproc-devel \
pkgconfig-libpostproc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavutil-devel \
libpostproc55-9 \
pkgconfig-libavutil"

inherit rpm
