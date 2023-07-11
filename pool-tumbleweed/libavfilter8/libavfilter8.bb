SUMMARY = "FFmpeg audio and video filtering library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libavfilter8-5.1.3-2.1.aarch64.rpm"
RPM_HASH = "61308890f0bba48494a4926a6b13f1adf198ab20d0438f61c215973de47bf0614bcc682a6ff913956d7f1f53c63172b980d89e7d4b8a630f196a32d74aebd833"

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
