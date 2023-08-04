SUMMARY = "FFmpeg audio and video filtering library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libavfilter9-6.0-3.1.aarch64.rpm"
RPM_HASH = "3121998b1ee7b67fd7dee4c36cc792878120b4c3e11fa22d7c9d90929f1972a752ee861555e35d188510dca5ef846c0814159d26006f7726b1b094d2623aed02"

RPROVIDES:${PN} += "libavfilter.so.9 \
libavfilter9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libass.so.9 \
libavcodec.so.60 \
libavcodec60 \
libavformat.so.60 \
libavformat60 \
libavutil.so.58 \
libavutil58 \
libbs2b.so.0 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libfribidi.so.0 \
liblilv-0.so.0 \
libm.so.6 \
libmysofa.so.1 \
libplacebo.so.292 \
libpostproc.so.57 \
libpostproc57 \
librubberband.so.2 \
libshaderc-shared.so.1 \
libswresample.so.4 \
libswresample4 \
libswscale.so.7 \
libswscale7 \
libva.so.2 \
libvidstab.so.1.1 \
libvmaf.so.1 \
libzimg.so.2 \
libzmq.so.5"

inherit rpm
