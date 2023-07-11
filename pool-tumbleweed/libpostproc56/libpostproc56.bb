SUMMARY = "FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libpostproc56-5.1.3-2.1.aarch64.rpm"
RPM_HASH = "6097117b7dc6a665c6f4eca7edb3f96f3428d8e8e320bd48794de3375cb210cfa67327e535a645b10f1af265028fc67f26e65611da841b0eff75738eb61f94ef"

RPROVIDES:${PN} += "libpostproc.so.56 \
libpostproc56"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.57 \
libavutil57 \
libc.so.6"

inherit rpm
