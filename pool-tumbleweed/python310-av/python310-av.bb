SUMMARY = "Python bindings for FFmpeg's libraries"
DESCRIPTION = "Pythonic bindings for FFmpeg's libraries."
LICENSE = "BSD-3-Clause"

PV = "10.0.0"

RPM_NAME = "python310-av-10.0.0-2.2.aarch64.rpm"
RPM_HASH = "c6993ecae734f4a37a6b4121c641da4f66bd3e3abdd7718dbda5048d4d6d8ee160fb91e93ba7a2cd5c92af8494196ad4ab1b4aa7a98f20de74b0061372e06abb"

RPROVIDES:${PN} += "python3-av \
python3.10dist-av \
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
