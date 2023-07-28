SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.4"

RPM_NAME = "libPocoDataODBC94-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "cc4590cf4c42d38e2f8508e96d8c520e152fa0f0c25c4cce5d6ff17e98130b3df7c0fffccaf52902da6b01fa21d16afa6f8f6f0e13cc40cb7731907409392346"

RPROVIDES:${PN} += "libPocoDataODBC.so.94 \
libPocoDataODBC94 \
poco-dataodbc"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoData.so.94 \
libPocoFoundation.so.94 \
libc.so.6 \
libgcc-s.so.1 \
libodbc.so.2 \
libstdc++.so.6"

inherit rpm
