SUMMARY = "FFmpeg audio and video filtering library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libavfilter8-5.1.3-2.2.aarch64.rpm"
RPM_HASH = "1ce98164f4b540a57bbe3401fa40681c4a322a1aea28fb29c537bd6ac5423cfb5e2a7063ea15b00e776368a11e3193bfc222699be6c80308a7f29e91868abe4d"

RPROVIDES:${PN} += "libavfilter.so.8 \
libavfilter8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libass.so.9 \
libavcodec.so.59 \
libavcodec59 \
libavformat.so.59 \
libavformat59 \
libavutil.so.57 \
libavutil57 \
libbs2b.so.0 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libfribidi.so.0 \
liblilv-0.so.0 \
libm.so.6 \
libmysofa.so.1 \
libpostproc.so.56 \
libpostproc56 \
librubberband.so.2 \
libshaderc-shared.so.1 \
libswresample.so.4.ff5 \
libswresample4-ff5 \
libswscale.so.6 \
libswscale6 \
libva.so.2 \
libvidstab.so.1.1 \
libvmaf.so.1 \
libzimg.so.2 \
libzmq.so.5"

inherit rpm
