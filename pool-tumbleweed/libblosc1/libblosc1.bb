SUMMARY = "A blocking, shuffling and lossless compression library"
DESCRIPTION = "Blosc is a metacompressor (using actual algorithms like BloscLZ, LZ4, \
LZ4HC, Snappy or Zlib) for binary data, with a focus on reducing \
memory bus activity."
LICENSE = "MIT & BSD-3-Clause & BSD-2-Clause"

PV = "1.21.1"

RPM_NAME = "libblosc1-1.21.1-1.11.aarch64.rpm"
RPM_HASH = "1f0c18640cc6d782e7aa0ff4e376fd4f6561f839e311c9882232f7c57f3f790995e36c3b02e058fb15ebc85c6bddff97b3a641b4ffe4debcb7d004a68b568d81"

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
