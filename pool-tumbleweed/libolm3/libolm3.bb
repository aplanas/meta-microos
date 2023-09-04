SUMMARY = "Double Ratchet cryptographic library as a C API"
DESCRIPTION = "An implementation of the Double Ratchet cryptographic ratchet \
in C and C++, including an implementation of the Megolm cryptographic ratchet. \
Double Ratchet cryptographic library as a C API"
LICENSE = "Apache-2.0"

PV = "3.2.15"

RPM_NAME = "libolm3-3.2.15-1.1.aarch64.rpm"
RPM_HASH = "50bbd0a494984f333594e80dd9924e0e0e84dfedd4509df27f2692ccabcc7342b9ff82498b903655a7a07f0b37cf5ae1e9aae2c27c8317c976d63bb7ef005169"

RPROVIDES:${PN} += "libolm.so.3 \
libolm3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
