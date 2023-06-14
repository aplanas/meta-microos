SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoFoundation92-1.12.2-1.4.aarch64.rpm"
RPM_HASH = "a73f47be1a2f6dc5f89dbc2ddce784de87d3aa35931e2b91b018cfcd673c108c04f3c9461b09b7b4a5d07a2c6e225d931925d202d756dfec8bc7421f8f0a1427"

RPROVIDES:${PN} += "libPocoFoundation.so.92 \
libPocoFoundation92 \
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
