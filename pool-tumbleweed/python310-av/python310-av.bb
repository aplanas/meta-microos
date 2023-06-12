SUMMARY = "Python bindings for FFmpeg's libraries"
DESCRIPTION = "Pythonic bindings for FFmpeg's libraries."
LICENSE = "BSD-3-Clause"

PV = "10.0.0"

RPM_NAME = "python310-av-10.0.0-2.2.aarch64.rpm"
RPM_HASH = "c6993ecae734f4a37a6b4121c641da4f66bd3e3abdd7718dbda5048d4d6d8ee160fb91e93ba7a2cd5c92af8494196ad4ab1b4aa7a98f20de74b0061372e06abb"

RPROVIDES:${PN} += "python3-av \
python3.10dist(av) \
python310-av \
python310-av(aarch-64) \
python3dist(av)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libavcodec.so.58.134()(64bit) \
libavcodec.so.58.134(LIBAVCODEC_58)(64bit) \
libavdevice.so.58.13()(64bit) \
libavdevice.so.58.13(LIBAVDEVICE_58)(64bit) \
libavfilter.so.7.110()(64bit) \
libavfilter.so.7.110(LIBAVFILTER_7)(64bit) \
libavformat.so.58.76()(64bit) \
libavformat.so.58.76(LIBAVFORMAT_58)(64bit) \
libavutil.so.56.70()(64bit) \
libavutil.so.56.70(LIBAVUTIL_56)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libswresample.so.3.9()(64bit) \
libswresample.so.3.9(LIBSWRESAMPLE_3)(64bit) \
libswscale.so.5.9()(64bit) \
libswscale.so.5.9(LIBSWSCALE_5)(64bit) \
python(abi) \
python310-numpy \
update-alternatives"

inherit rpm
