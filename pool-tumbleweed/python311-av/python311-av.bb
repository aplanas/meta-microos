SUMMARY = "Python bindings for FFmpeg's libraries"
DESCRIPTION = "Pythonic bindings for FFmpeg's libraries."
LICENSE = "BSD-3-Clause"

PV = "10.0.0"

RPM_NAME = "python311-av-10.0.0-2.2.aarch64.rpm"
RPM_HASH = "d9f65794c9f98218231785ee7343afe1f15640b03e75d0746e642244e9b43241cdaf3d13278a0e4f115c210731eb6885262be160b6f23a5937047874435bf18b"

RPROVIDES:${PN} += "python3.11dist-av \
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
