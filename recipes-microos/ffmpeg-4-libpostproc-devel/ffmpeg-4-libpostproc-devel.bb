SUMMARY = "Development files for the FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing. \
 \
This subpackage contains the headers for FFmpeg libpostproc."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libpostproc-devel-4.4.4-1.1.aarch64.rpm"
RPM_HASH = "428dc00b94d601bd75f9fe2901fabea5b3d7e45eb9c57e1453fd21583245cc3ba9d178bf6f8a9f5988940f68e2f5b7866cd7c746f75fb05a97e5fb09b938ad57"

RPROVIDES:${PN} += "ffmpeg-4-libpostproc-devel ffmpeg-4-libpostproc-devel(aarch-64) libpostproc-devel pkgconfig(libpostproc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-4-libavutil-devel libpostproc55_9 pkgconfig(libavutil)"

inherit rpm
