SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.4"

RPM_NAME = "libPocoCrypto94-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "782c127d9e59a18aaca010f5bb9add964419a6a7a3ca47131e4effa7f9007b813b9b6070bc059a58d340089ce6cec2e6f66e4d76cdfb703e7399c2b26396cd52"

RPROVIDES:${PN} += "libPocoCrypto.so.94 \
libPocoCrypto94 \
poco-crypto"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.94 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
