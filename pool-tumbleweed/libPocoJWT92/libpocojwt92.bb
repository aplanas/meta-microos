SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoJWT92-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "715217d84529d9e4f5f5d3a2c5bb97be193dda13c16da63aa85f0b467db3e7138b639cbe5cb6ad6d5686961db0d97d9c8760227997da8efbac4236cc2fd4336f"

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
