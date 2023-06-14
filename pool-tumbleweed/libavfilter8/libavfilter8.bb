SUMMARY = "FFmpeg audio and video filtering library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "libavfilter8-5.1.3-1.2.aarch64.rpm"
RPM_HASH = "3d558148c9b12ee4ced8f6b067ebd56c7d488b3229f2ad4e7fe27b78783f125651d074d0fc585ad1cee89178579eef5baee7d1e461a831172239b5caaff62133"

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
