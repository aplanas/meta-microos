SUMMARY = "Python bindings for FFmpeg's libraries"
DESCRIPTION = "Pythonic bindings for FFmpeg's libraries."
LICENSE = "BSD-3-Clause"

PV = "10.0.0"

RPM_NAME = "python310-av-10.0.0-2.4.aarch64.rpm"
RPM_HASH = "22e7592d558d85b07393914037e188130fd9f3ee9165e345ed5e0d43584e957dd949e161853e92fc43f8f15c254cf0ef3920a8fb897fbb42c4344a5e45bed90f"

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
