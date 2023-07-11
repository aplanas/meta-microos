SUMMARY = "Python bindings for FFmpeg's libraries"
DESCRIPTION = "Pythonic bindings for FFmpeg's libraries."
LICENSE = "BSD-3-Clause"

PV = "10.0.0"

RPM_NAME = "python39-av-10.0.0-2.4.aarch64.rpm"
RPM_HASH = "848ee07448cedb9fe263bc5c78f234a8302a2b131aa960256ada34d7878e9c4dd3f415285e7843d6475168060d0f09b55be19d7b366661a769e96b2fcffc0525"

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
