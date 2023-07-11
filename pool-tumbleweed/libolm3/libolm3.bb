SUMMARY = "Double Ratchet cryptographic library as a C API"
DESCRIPTION = "An implementation of the Double Ratchet cryptographic ratchet \
in C and C++, including an implementation of the Megolm cryptographic ratchet. \
Double Ratchet cryptographic library as a C API"
LICENSE = "Apache-2.0"

PV = "3.2.14"

RPM_NAME = "libolm3-3.2.14-1.6.aarch64.rpm"
RPM_HASH = "3d0fc0225cabd922b0c45f54b35df8ee480b115cc38e9c91f8bdb2dcbceb1d606da224e6924fe49b6725a6189a5a0c07161a7fcfd6ed167a94ea02019cf6a417"

RPROVIDES:${PN} += "libolm.so.3 \
libolm3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
