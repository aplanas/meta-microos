SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoJWT92-1.12.2-1.5.aarch64.rpm"
RPM_HASH = "a00f702d9d7a1c8809569fdd8854ffa08d8055887a99725d8336c1e8e1582d9b49bd2d69042496d2407b4069bddff6c98956bd4d4bb6d6ea0f5084a534d96deb"

RPROVIDES:${PN} += "libPocoJWT.so.92 \
libPocoJWT92 \
poco-jwt"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoCrypto.so.92 \
libPocoFoundation.so.92 \
libPocoJSON.so.92 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
