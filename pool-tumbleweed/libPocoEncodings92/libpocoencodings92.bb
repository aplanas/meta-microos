SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoEncodings92-1.12.2-1.5.aarch64.rpm"
RPM_HASH = "9254a2cc910d6f00bdfa1a02cf303a547488a86987f7812601d6d4183e77a03238378ab174f117fab40885c939450d97b7e6f468fc639ce773286bf1c4f6a23c"

RPROVIDES:${PN} += "libPocoEncodings.so.92 \
libPocoEncodings92 \
poco-encodings"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.92 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
