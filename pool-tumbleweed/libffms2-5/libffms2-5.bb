SUMMARY = "Wrapper library around libffmpeg"
DESCRIPTION = "FFmpegSource (usually known as FFMS or FFMS2) is a wrapper \
library around FFmpeg, plus some additional components to deal with file \
formats libavformat has (or used to have) problems with."
LICENSE = "MIT"

PV = "2.40+44"

RPM_NAME = "libffms2-5-2.40+44-1.5.aarch64.rpm"
RPM_HASH = "e5edab45aa085da9db1ce06d5d65c275beebbd928baa903a07eb25331c48bebe348f6806e1f5f7702c0296d6553b6691e853c97ba62e7c01c480742c7a3fe98b"

RPROVIDES:${PN} += "libffms2-5 \
libffms2-5(aarch-64) \
libffms2.so.5()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libavcodec.so.60()(64bit) \
libavformat.so.60()(64bit) \
libavutil.so.58()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libswresample.so.4()(64bit) \
libswscale.so.7()(64bit) \
libz.so.1()(64bit)"

inherit rpm
