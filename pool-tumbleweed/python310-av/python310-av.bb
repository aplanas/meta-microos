SUMMARY = "Python bindings for FFmpeg's libraries"
DESCRIPTION = "Pythonic bindings for FFmpeg's libraries."
LICENSE = "BSD-3-Clause"

PV = "10.0.0"

RPM_NAME = "python310-av-10.0.0-3.1.aarch64.rpm"
RPM_HASH = "f82a0a1e8bf8aed8afd8b1bdcb1cff5ac79bf704c42a070d49a3714b3f9a6f44de8f4555fa2d316ec937a55e60e43c0b7c268bbf81a8f244ebbff0f12bb460e6"

RPROVIDES:${PN} += "python3.10dist-av \
python310-av \
python3dist-av"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libavcodec.so.58.134 \
libavdevice.so.58.13 \
libavfilter.so.7.110 \
libavformat.so.58.76 \
libavutil.so.56.70 \
libc.so.6 \
libswresample.so.3.9 \
libswscale.so.5.9 \
python-abi \
python310-numpy \
update-alternatives"

inherit rpm
