SUMMARY = "FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libpostproc55_9-4.4.4-2.1.aarch64.rpm"
RPM_HASH = "d540e9233f7c61c74ac0e5cdc21f2035119abe14b23a1d405bd9ca330895c1f6d547fcaca8f2e13ef8ffa068c1a9f9140006651f6c7cb71f50ca61314f7a4258"

RPROVIDES:${PN} += "libpostproc.so.55.9 \
libpostproc55-9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.56.70 \
libavutil56-70 \
libc.so.6"

inherit rpm
