SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoMongoDB92-1.12.2-1.5.aarch64.rpm"
RPM_HASH = "6f0f02e9122e904521067e9209cdaa2149757d33a552b11441ee32390c30a009ebdf0eb522d6679ba8d66156d4fc1e00b46acb2766d3272cfaccc3d4f5f4fdd2"

RPROVIDES:${PN} += "libPocoMongoDB.so.92 \
libPocoMongoDB92 \
poco-mongodb"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.92 \
libPocoNet.so.92 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
