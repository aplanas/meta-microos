SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoNetSSL92-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "89943b5237fe649107acb4f08ed9ea3ada12afcd5f7e06532bfd28bdfa65e89f026cc331baa3c907ccee4e991f2ff912d4def350150f7d59988ef8e4d691d023"

RPROVIDES:${PN} += "libPocoNetSSL.so.92()(64bit) \
libPocoNetSSL92 \
libPocoNetSSL92(aarch-64) \
poco-netssl"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libPocoCrypto.so.92()(64bit) \
libPocoFoundation.so.92()(64bit) \
libPocoNet.so.92()(64bit) \
libPocoUtil.so.92()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
