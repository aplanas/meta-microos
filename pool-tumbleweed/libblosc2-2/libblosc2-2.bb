SUMMARY = "A fast, compressed, persistent binary data store library for C"
DESCRIPTION = "Blosc is a high performance compressor optimized for binary data \
(i.e. floating point numbers, integers and booleans)."
LICENSE = "BSD-2-Clause & BSD-3-Clause & MIT"

PV = "2.10.2"

RPM_NAME = "libblosc2-2-2.10.2-1.1.aarch64.rpm"
RPM_HASH = "457b340c924006d46079151372ca8860f53cbf0b7ee89b5e7a679cdcc3f06c529575dc7fc7407472a4bdc4acf7c6d34382c83ffc3b372a07aeb8a19e6d2fe015"

RPROVIDES:${PN} += "libblosc2-2 \
libblosc2.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
liblz4.so.1 \
libm.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
