SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.4"

RPM_NAME = "libPocoCppParser94-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "49d442d2515c9a154d02f33f102e15606ce16f6a2bca41b8fdb76aca2ff81ac8473b986ec09de5754d22643d5d2243985938196074c116b0dab580c3ba03af16"

RPROVIDES:${PN} += "libPocoCppParser.so.94 \
libPocoCppParser94 \
poco-cppparser"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.94 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
