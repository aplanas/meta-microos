SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoDataODBC92-1.12.2-1.5.aarch64.rpm"
RPM_HASH = "2be538ef3b59edd48f19f98ff51e4f593a9cc9fd8393ab90f49c1796fbfa4e4bb2714b03c35b4947ba4a5f7eb6902c99eb40beae9c8622210948ba18b8a14a8e"

RPROVIDES:${PN} += "libPocoDataODBC.so.92 \
libPocoDataODBC92 \
poco-dataodbc"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoData.so.92 \
libPocoFoundation.so.92 \
libc.so.6 \
libgcc-s.so.1 \
libodbc.so.2 \
libstdc++.so.6"

inherit rpm
