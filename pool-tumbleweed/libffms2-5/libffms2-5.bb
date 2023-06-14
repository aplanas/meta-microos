SUMMARY = "Wrapper library around libffmpeg"
DESCRIPTION = "FFmpegSource (usually known as FFMS or FFMS2) is a wrapper \
library around FFmpeg, plus some additional components to deal with file \
formats libavformat has (or used to have) problems with."
LICENSE = "MIT"

PV = "2.40+44"

RPM_NAME = "libffms2-5-2.40+44-1.5.aarch64.rpm"
RPM_HASH = "e5edab45aa085da9db1ce06d5d65c275beebbd928baa903a07eb25331c48bebe348f6806e1f5f7702c0296d6553b6691e853c97ba62e7c01c480742c7a3fe98b"

RPROVIDES:${PN} += "libffms2-5 \
libffms2.so.5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavcodec.so.60 \
libavformat.so.60 \
libavutil.so.58 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libswresample.so.4 \
libswscale.so.7 \
libz.so.1"

inherit rpm
