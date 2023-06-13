SUMMARY = "FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libpostproc56-5.1.3-1.2.aarch64.rpm"
RPM_HASH = "c10e2f8292d628b3e4f09069d97de05b164d9fc5f5399d5c9dc60b66a188c92588130fda68c7110b5b34115a4b756896151c75bd13907d91a18533098d0e9413"

RPROVIDES:${PN} += "libpostproc.so.56()(64bit) \
libpostproc56 \
libpostproc56(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libavutil.so.57()(64bit) \
libavutil57 \
libc.so.6()(64bit)"

inherit rpm
