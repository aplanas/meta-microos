SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoCrypto92-1.12.2-1.5.aarch64.rpm"
RPM_HASH = "4cfe6e4aebef19faa694c0b29bbdf7539526b0db0590bb4d2270071cd3be7020b4c2e6e5636aecc9ad63b264bb449776141c6092840e55ab990765b55a94bb31"

RPROVIDES:${PN} += "libPocoCrypto.so.92 \
libPocoCrypto92 \
poco-crypto"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.92 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
