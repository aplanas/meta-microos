SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoMongoDB92-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "30d00e1d1f21b2d8df68202a40d55b9b6c98421c5376bad151297c28c0f108569747857f119897a5471ff92931e717701322c03c508416b3828f721332eed24b"

RPROVIDES:${PN} += "libPocoMongoDB.so.92()(64bit) \
libPocoMongoDB92 \
libPocoMongoDB92(aarch-64) \
poco-mongodb"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libPocoFoundation.so.92()(64bit) \
libPocoNet.so.92()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
