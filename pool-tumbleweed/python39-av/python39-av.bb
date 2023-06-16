SUMMARY = "Python bindings for FFmpeg's libraries"
DESCRIPTION = "Pythonic bindings for FFmpeg's libraries."
LICENSE = "BSD-3-Clause"

PV = "10.0.0"

RPM_NAME = "python39-av-10.0.0-2.2.aarch64.rpm"
RPM_HASH = "f7ed24dda54615e8e8a3015e6bd8527be96b87b4f467380f253a413a7287c32676b5ac41defa8810160ad1a303b1b38515f9180ff22f6a58fb7574d13f5e0725"

RPROVIDES:${PN} += "python3.9dist-av \
python39-av \
python3dist-av"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
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
python39-numpy \
update-alternatives"

inherit rpm
