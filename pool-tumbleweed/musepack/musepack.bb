SUMMARY = "Audio Compression Format"
DESCRIPTION = "Musepack is an audio compression format with an emphasis on audio \
quality. It is not lossless, but it is designed for transparency, so \
that differences between the original wave file and the much smaller \
MPC file are indiscernible (given enough of a bitrate, as usual). \
 \
It is based on the MPEG-1 Layer-2 / MP2 algorithms, but has further \
been developed."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & GPL-2.0-or-later & Zlib"

PV = "r475"

RPM_NAME = "musepack-r475-4.12.aarch64.rpm"
RPM_HASH = "4aa2423a65d3fea0094fd93fee00387b5540c2f6436bd69157486bc7a3a3009307ebf85fb10aeab28d1f25af4c821dcbea70cc09ee145ca8615c71ec02e3f9bf"

RPROVIDES:${PN} += "musepack"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcuefile.so.0 \
libm.so.6 \
libmpcdec.so.6 \
libreplaygain.so.1"

inherit rpm
