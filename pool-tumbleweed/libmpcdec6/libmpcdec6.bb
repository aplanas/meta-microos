SUMMARY = "Audio Compression Format"
DESCRIPTION = "Musepack is an audio compression format with an emphasis on audio \
quality. It is not lossless, but it is designed for transparency, so \
that differences between the original wave file and the much smaller \
MPC file are indiscernible (given enough of a bitrate, as usual). \
 \
It is based on the MPEG-1 Layer-2 / MP2 algorithms, but has further \
been developed."
LICENSE = "BSD-3-Clause & Zlib"

PV = "r475"

RPM_NAME = "libmpcdec6-r475-4.11.aarch64.rpm"
RPM_HASH = "ee70173593e9e147795a78dc60a4bb3841b20d1db7a6bae1f834f6b099c746fa970e017972cd5ac1f8d85529c0ebcd16a26118863957fb4606e12bb86ff46444"

RPROVIDES:${PN} += "libmpcdec.so.6()(64bit) \
libmpcdec6 \
libmpcdec6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
