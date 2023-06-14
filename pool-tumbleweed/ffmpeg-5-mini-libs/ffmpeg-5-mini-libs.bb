SUMMARY = "Feature-reduced build of FFmpeg, a multimedia framework"
DESCRIPTION = "FFmpeg is a multimedia framework. \
This package contains a cut-down version for building other packages."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-mini-libs-5.1.3-1.1.aarch64.rpm"
RPM_HASH = "83f6ca0b8156c0c9d90f6c3658aa098ae8959a39a33c7f490abe2c5418016c2c17a47aa01509d1329cf2bf0611b1aa74acba536074b67b71b1f44b1fe741dff1"

RPROVIDES:${PN} += "ffmpeg-5-mini-libs \
libavcodec.so.59 \
libavdevice.so.59 \
libavfilter.so.8 \
libavformat.so.59 \
libavutil.so.57 \
libpostproc.so.56 \
libswresample.so.4.ff5 \
libswscale.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
this-is-only-for-build-envs"

inherit rpm
