SUMMARY = "A fast, compressed, persistent binary data store library for C"
DESCRIPTION = "Blosc is a high performance compressor optimized for binary data \
(i.e. floating point numbers, integers and booleans)."
LICENSE = "BSD-2-Clause & BSD-3-Clause & MIT"

PV = "2.9.1"

RPM_NAME = "libblosc2-2-2.9.1-2.1.aarch64.rpm"
RPM_HASH = "b266f2efb9352997aa5d398a19a5132baa5870f8e2530c6814a7bf9be7fdcf261bcd5496d077dec38591b1e81a35ca55fc3ceb3ed8ae93e5215af97baa096e88"

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
