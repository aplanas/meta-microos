SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.4"

RPM_NAME = "libPocoZip94-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "bee796d058c5e7b74b4491321989e7dd9b707ea2811052cf5fab733456c4a6eab2670f5f207cf1b600cab037fc10cfa12a62c24dd9efe12994ad777817febd5d"

RPROVIDES:${PN} += "libPocoZip.so.94 \
libPocoZip94 \
poco-zip"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.94 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
