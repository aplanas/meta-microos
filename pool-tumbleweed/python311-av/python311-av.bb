SUMMARY = "Python bindings for FFmpeg's libraries"
DESCRIPTION = "Pythonic bindings for FFmpeg's libraries."
LICENSE = "BSD-3-Clause"

PV = "10.0.0"

RPM_NAME = "python311-av-10.0.0-2.4.aarch64.rpm"
RPM_HASH = "a24da8314b02d4d40a05ecfdc6cf91a22f0c62e19c11f2d61d15e778edec296d48cdd2a5db471225daf992d1a613e408166f1e08f1496c3f4ef6eaddf8322315"

RPROVIDES:${PN} += "python3-av \
python3.11dist-av \
python311-av \
python3dist-av"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
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
python311-numpy \
update-alternatives"

inherit rpm
