SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.4"

RPM_NAME = "libPocoNetSSL94-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "8dce414ec3f8f6d67e2aecc8efeb28ff838a9eb291744188d8cd48ee9d9934cafd6d0344deca85ce711f1f3c00031dbbd0c60ef9de079dbceb62423cc9379381"

RPROVIDES:${PN} += "libPocoNetSSL.so.94 \
libPocoNetSSL94 \
poco-netssl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoCrypto.so.94 \
libPocoFoundation.so.94 \
libPocoNet.so.94 \
libPocoUtil.so.94 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
