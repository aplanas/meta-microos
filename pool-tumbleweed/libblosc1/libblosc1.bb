SUMMARY = "A blocking, shuffling and lossless compression library"
DESCRIPTION = "Blosc is a metacompressor (using actual algorithms like BloscLZ, LZ4, \
LZ4HC, Snappy or Zlib) for binary data, with a focus on reducing \
memory bus activity."
LICENSE = "BSD-2-Clause & BSD-3-Clause & MIT"

PV = "1.21.4"

RPM_NAME = "libblosc1-1.21.4-1.1.aarch64.rpm"
RPM_HASH = "d4f44852418583d0ada1f55ca29e7a3ac7fa44170a0c0b0db797504a3d5c3843d14f2b5f19adb997f3c7bc45a5d3822d88509b9580e48a03e097c8acfd6432c0"

RPROVIDES:${PN} += "libblosc.so.1 \
libblosc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblz4.so.1 \
libsnappy.so.1 \
libz.so.1 \
libzstd.so.1"

inherit rpm
