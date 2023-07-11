SUMMARY = "FFmpeg audio and video filtering library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "libavfilter9-6.0-2.4.aarch64.rpm"
RPM_HASH = "22b64be4a57e65a3b07546ac9473e14500f17dc35f066904be98949a28bd87024448b85f756c351b5d34ff402e233278302d8dd0e7c070396bf7f246b4847acc"

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
libplacebo.so.264 \
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
