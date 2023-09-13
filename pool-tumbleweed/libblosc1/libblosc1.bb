SUMMARY = "A blocking, shuffling and lossless compression library"
DESCRIPTION = "Blosc is a metacompressor (using actual algorithms like BloscLZ, LZ4, \
LZ4HC, Snappy or Zlib) for binary data, with a focus on reducing \
memory bus activity."
LICENSE = "BSD-2-Clause & BSD-3-Clause & MIT"

PV = "1.21.5"

RPM_NAME = "libblosc1-1.21.5-1.1.aarch64.rpm"
RPM_HASH = "79cce93c28e255aa07d973c18abb9692fb870ddcef3d36c7d778eb9bd1128f9161dea984d95001657f33a5f06b6948403c7e81d909a9029d639217aefa0998a9"

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
