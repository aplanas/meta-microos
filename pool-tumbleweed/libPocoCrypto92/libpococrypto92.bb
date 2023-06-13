SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoCrypto92-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "3d1853f98b62f8af44e38f7f3a52885542143ecc0d0ae1904d49b44c8765c7645ceb64c193e0cdd12f9417539e0f7ebf875a3f71c1719e3c5e80dc4648fe48ef"

RPROVIDES:${PN} += "libPocoCrypto.so.92()(64bit) \
libPocoCrypto92 \
libPocoCrypto92(aarch-64) \
poco-crypto"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libPocoFoundation.so.92()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
