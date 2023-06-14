SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoDataODBC92-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "5204a8337fc20e2869dd9193e92c5f171d7c0b1fa51a5bb87becf7b61f009b08853b98096de08bd6b46baaedcd7b3037177d0cd489565edec19c20e2b48faafd"

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
