SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.4"

RPM_NAME = "libPocoJWT94-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "f096216d730f41f532719feb19ef65b67cf7af7a954493f92201a326f848c594bd9cec2496afd05c90715784ba49bcbd337037423bf8b49b4eae68dcaf5dcd3a"

RPROVIDES:${PN} += "libPocoJWT.so.94 \
libPocoJWT94 \
poco-jwt"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoCrypto.so.94 \
libPocoFoundation.so.94 \
libPocoJSON.so.94 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
