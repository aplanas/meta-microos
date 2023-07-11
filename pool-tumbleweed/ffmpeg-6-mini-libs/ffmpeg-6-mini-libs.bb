SUMMARY = "Feature-reduced build of FFmpeg, a multimedia framework"
DESCRIPTION = "FFmpeg is a multimedia framework. \
This package contains a cut-down version for building other packages."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-mini-libs-6.0-2.2.aarch64.rpm"
RPM_HASH = "68ca553ef1a31398a906dd446ced7ca49bdf358a2deb1df1dfb2523e21b4dd06e91adf48b6204fb68091f0a7aa90a3e1b3bb1185588e7dbf8112c269e30b7971"

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
