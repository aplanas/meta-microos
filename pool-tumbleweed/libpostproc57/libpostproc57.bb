SUMMARY = "FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libpostproc57-6.0-2.4.aarch64.rpm"
RPM_HASH = "bcafdbc41fab2def2ef281b01d089e417669bfdc7c688022088ab77739dfa0c6bd7a211e5781343a9d37d24c315f05647a86a515812995d9cdb9de338f41fc96"

RPROVIDES:${PN} += "libpostproc.so.57 \
libpostproc57"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.58 \
libavutil58 \
libc.so.6"

inherit rpm
