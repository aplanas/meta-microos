SUMMARY = "Feature-reduced build of FFmpeg, a multimedia framework"
DESCRIPTION = "FFmpeg is a multimedia framework. \
This package contains a cut-down version for building other packages."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-mini-libs-6.0-3.1.aarch64.rpm"
RPM_HASH = "34b41766c92aaf090dba268c0a3aa03ff58239438999c8b08c618488d83166cb7dcac3141a22f12da43ce31cec547421f9f72e3f9cb0dd4a18d165bfb41a7cd2"

RPROVIDES:${PN} += "ffmpeg-6-mini-libs \
libavcodec.so.60 \
libavdevice.so.60 \
libavfilter.so.9 \
libavformat.so.60 \
libavutil.so.58 \
libpostproc.so.57 \
libswresample.so.4 \
libswscale.so.7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
this-is-only-for-build-envs"

inherit rpm
