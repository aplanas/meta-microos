SUMMARY = "FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libpostproc57-6.0-3.1.aarch64.rpm"
RPM_HASH = "2583e8970eb0b4b416d5c711b2d911dca08030d68acd1551d8d242560c458549cd86260f470e7f8d2196f3620bdecd7cf4d16dafc16f08fcac09bc8587813830"

RPROVIDES:${PN} += "libpostproc.so.57 \
libpostproc57"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.58 \
libavutil58 \
libc.so.6"

inherit rpm
