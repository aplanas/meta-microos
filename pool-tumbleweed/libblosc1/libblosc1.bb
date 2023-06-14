SUMMARY = "A blocking, shuffling and lossless compression library"
DESCRIPTION = "Blosc is a metacompressor (using actual algorithms like BloscLZ, LZ4, \
LZ4HC, Snappy or Zlib) for binary data, with a focus on reducing \
memory bus activity."
LICENSE = "MIT & BSD-3-Clause & BSD-2-Clause"

PV = "1.21.1"

RPM_NAME = "libblosc1-1.21.1-1.10.aarch64.rpm"
RPM_HASH = "2dbfc72ff32f4abdfd52f4b27c551c2dd7956eac909c65efea9017f4bc409e82cff5dab83ef67a67fb1cfef28e430f4039bec501c3b4f49245a56f02e0528946"

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
