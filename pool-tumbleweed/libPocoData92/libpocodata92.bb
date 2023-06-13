SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoData92-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "ea1056c8841c01d92d45007ba829718bf4b340d1ca7c8de34f3ec6dd5885708c13e244d1ca1cd8ab677ff1604c8e6b7f085e82ff0a2b8741953a44bb7ad900ce"

RPROVIDES:${PN} += "libPocoData.so.92()(64bit) \
libPocoData92 \
libPocoData92(aarch-64) \
poco-data"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libPocoFoundation.so.92()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
