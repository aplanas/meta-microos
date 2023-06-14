SUMMARY = "Feature-reduced build of FFmpeg, a multimedia framework"
DESCRIPTION = "FFmpeg is a multimedia framework. \
This package contains a cut-down version for building other packages."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-mini-libs-6.0-2.1.aarch64.rpm"
RPM_HASH = "7d0a8e03379e90d9de497f631850f97ba69ce7ebd5297af51b837975452b98ec2d4bade2afc335cb59c8308ac6f624cfef3c317920d046146c6bdc8ec9719819"

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
