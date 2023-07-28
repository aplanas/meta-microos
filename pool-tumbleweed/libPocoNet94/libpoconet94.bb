SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.4"

RPM_NAME = "libPocoNet94-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "f58e7ff3a7d79915f866827568bd288bca6211b5758befd856979f3528a44866b8a4f36453399f7f7d6e62f330a8469455036baf0243d9b75e255f4c77f8dd0b"

RPROVIDES:${PN} += "libPocoNet.so.94 \
libPocoNet94 \
poco-net"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.94 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
