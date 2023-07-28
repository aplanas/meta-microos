SUMMARY = "C++ Framework for Network-based Applications"
DESCRIPTION = "C++ class libraries and frameworks for building \
network- and Internet-based applications."
LICENSE = "BSL-1.0"

PV = "1.12.4"

RPM_NAME = "libPocoJSON94-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "37e223d9d8e68e3eaed3aef8962de37e1e789545839c98aa69d97154c37a362d797754c96e2a5865882716223cebfa96eb1705e165f135a17153d70f07dfc431"

RPROVIDES:${PN} += "libPocoJSON.so.94 \
libPocoJSON94 \
poco-json"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoFoundation.so.94 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
