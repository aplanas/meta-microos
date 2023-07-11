SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoData92-1.12.2-1.5.aarch64.rpm"
RPM_HASH = "7cb3af8fbb75e171b6e0ee1b3d15fcbab9121bb6508a526214f24c24aef542bbcb27b4f6294acce9368dd852b54811391b8ab3dfe64a77e290ea4785e8d3947b"

RPROVIDES:${PN} += "libPocoData.so.92 \
libPocoData92 \
poco-data"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.92 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
