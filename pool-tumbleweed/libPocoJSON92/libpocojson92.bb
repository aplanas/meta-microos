SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoJSON92-1.12.2-1.5.aarch64.rpm"
RPM_HASH = "f6f75ab458b4b2e2143cd6b5c4dac6b7eea182be68cb35eff5fd49c64d3443c39a627e92408754700b96cb715476e8b52da3b9fb4033501ae8d920ad4c627c07"

RPROVIDES:${PN} += "libPocoJSON.so.92 \
libPocoJSON92 \
poco-json"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.92 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
