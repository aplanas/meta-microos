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

RPM_NAME = "libmpcdec6-r475-4.12.aarch64.rpm"
RPM_HASH = "815457922697e9e8ba8525a78846ceb2f170af4702dd18dc19b53d9682498a1ff666a76556d95a3447afb9625f7a7fa56aacb06fb5cb12af42ee2ad0471a17b2"

RPROVIDES:${PN} += "libmpcdec.so.6 \
libmpcdec6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
