SUMMARY = "FFmpeg post-processing library"
DESCRIPTION = "A library with video postprocessing filters, such as deblocking and \
deringing filters, noise reduction, automatic contrast and brightness \
correction, linear/cubic interpolating deinterlacing."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libpostproc55_9-4.4.4-2.3.aarch64.rpm"
RPM_HASH = "df53fe7497aad2f9ab1a389df518f06640717fe4bea039dac60b17748fadd593e16caca1078d9a9d8a3999cddc69aed003c0ce33d84f9762ce00ba51151fce63"

RPROVIDES:${PN} += "libpostproc.so.55.9 \
libpostproc55-9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.56.70 \
libavutil56-70 \
libc.so.6"

inherit rpm
