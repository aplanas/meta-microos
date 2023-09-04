SUMMARY = "Python bindings for FFmpeg's libraries"
DESCRIPTION = "Pythonic bindings for FFmpeg's libraries."
LICENSE = "BSD-3-Clause"

PV = "10.0.0"

RPM_NAME = "python39-av-10.0.0-3.1.aarch64.rpm"
RPM_HASH = "c03fb636bfce0e0ff47b019d67c4caac97da840291395b19817547e9669c74f31d1fd2ce85353359f06814b2758c1ba3d6878b7aabd51cb57afa8ff6d04bd192"

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
