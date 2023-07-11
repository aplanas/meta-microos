SUMMARY = "Feature-reduced build of FFmpeg, a multimedia framework"
DESCRIPTION = "FFmpeg is a multimedia framework. \
This package contains a cut-down version for building other packages."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-mini-libs-5.1.3-2.1.aarch64.rpm"
RPM_HASH = "c8e3573aa4c8acd4896cf27e5443c802eec7b16bac1d0b3d037ca0e563ebf443910998a7cf333d3ee4f4c7354aafed002b55c6d0142b6987d46edf864a23fe7a"

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
