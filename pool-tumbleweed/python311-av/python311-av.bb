SUMMARY = "Python bindings for FFmpeg's libraries"
DESCRIPTION = "Pythonic bindings for FFmpeg's libraries."
LICENSE = "BSD-3-Clause"

PV = "10.0.0"

RPM_NAME = "python311-av-10.0.0-3.1.aarch64.rpm"
RPM_HASH = "4c9adbf68e5304d72fe712befa65acd79d36654259bbad2decf83542ec431e61fe7f970a819497bdf1f12c66a7c058cf02f8181e0873a616f4c01a8d2d9f4ced"

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
