SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoPDF92-1.12.2-1.5.aarch64.rpm"
RPM_HASH = "eb61ade1fc73b43a2c0592bd9010e82d74cb59728bf9c08c9ff18a8194aac6d524e8a02dd8062d90b872e573ed6ebe8da7db003ec9f489d60d1b4312deb9fa76"

RPROVIDES:${PN} += "libPocoPDF.so.92 \
libPocoPDF92 \
poco-pdf"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.92 \
libPocoUtil.so.92 \
libPocoXML.so.92 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
