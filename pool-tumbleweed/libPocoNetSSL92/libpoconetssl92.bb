SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoNetSSL92-1.12.2-1.5.aarch64.rpm"
RPM_HASH = "4b2de0b141bb6602d980156c8d9fbe619758fee9c78c6636c7b5445567cee546ff53c3bd37202a1a880042c309d8c7d875520ee9cac71e0f2db6d9adfd9a3dda"

RPROVIDES:${PN} += "libPocoNetSSL.so.92 \
libPocoNetSSL92 \
poco-netssl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoCrypto.so.92 \
libPocoFoundation.so.92 \
libPocoNet.so.92 \
libPocoUtil.so.92 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6"

inherit rpm
