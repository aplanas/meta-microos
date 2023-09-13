SUMMARY = "FFmpeg audio and video filtering library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libavfilter7_110-4.4.4-2.3.aarch64.rpm"
RPM_HASH = "07919808dd16f85fdc9a8f863409e3bcc516f893e021913cc6e3b40af23c4a0b52d6417367a55ce2acf2693a6054831afaf4eb27f4b837a291331ad90a4e27d4"

RPROVIDES:${PN} += "libavfilter.so.7.110 \
libavfilter7-110"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSPIRV.so.13 \
libass.so.9 \
libavcodec.so.58.134 \
libavcodec58-134 \
libavformat.so.58.76 \
libavformat58-76 \
libavresample.so.4.0 \
libavresample4-0 \
libavutil.so.56.70 \
libavutil56-70 \
libbs2b.so.0 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libfribidi.so.0 \
libglslang.so.13 \
liblilv-0.so.0 \
libm.so.6 \
libmysofa.so.1 \
libpostproc.so.55.9 \
libpostproc55-9 \
librubberband.so.2 \
libstdc++.so.6 \
libswresample.so.3.9 \
libswresample3-9 \
libswscale.so.5.9 \
libswscale5-9 \
libva.so.2 \
libvidstab.so.1.1 \
libvmaf.so.1 \
libvulkan.so.1 \
libzimg.so.2 \
libzmq.so.5"

inherit rpm
