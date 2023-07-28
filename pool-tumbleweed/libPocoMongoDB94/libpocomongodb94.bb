SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.4"

RPM_NAME = "libPocoMongoDB94-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "beb5059a87f5c6dc1845ec7268f643ec0145f270f3d2a39106ba8faee82067a604ecfe0211836d6e8179ff58befca388d6b501f53c87406fff122f2c6dbd95c9"

RPROVIDES:${PN} += "libPocoMongoDB.so.94 \
libPocoMongoDB94 \
poco-mongodb"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.94 \
libPocoNet.so.94 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
