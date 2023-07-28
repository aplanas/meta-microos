SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.4"

RPM_NAME = "libPocoFoundation94-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "22b0a5831fe0648df91a40265d71fec73ad0fc5c5055509bc27a8dc6b5fc527971ec872b1ad0fad07661ccc5e0019a9af45cb749a36adf92d603039792abdd5f"

RPROVIDES:${PN} += "libPocoFoundation.so.94 \
libPocoFoundation94 \
poco-foundation"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libpcre2-8.so.0 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
