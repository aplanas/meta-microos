SUMMARY = "FFmpeg audio and video filtering library"
DESCRIPTION = "The libavfilter library provides a generic audio/video filtering \
framework containing several filters, sources and sinks."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libavfilter7_110-4.4.4-2.2.aarch64.rpm"
RPM_HASH = "4dd33b6a7f4b7f93d7aecb4f8d660497c0d07ad61c967bbcd099f2d1a230c9c6159e21c6c6f072a4ac9bf5a56054c152c3066ae8298910e24f2e06b0bb95ad78"

RPROVIDES:${PN} += "libavfilter.so.7.110 \
libavfilter7-110"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSPIRV.so.12 \
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
libglslang.so.12 \
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
