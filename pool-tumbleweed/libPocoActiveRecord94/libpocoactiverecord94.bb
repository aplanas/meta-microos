SUMMARY = "POCO C++ Active Record"
DESCRIPTION = "ActiveRecord is a simple and lightweight object-relational mapping (ORM) \
framework based on the Active Record pattern and the Data library."
LICENSE = "BSL-1.0"

PV = "1.12.4"

RPM_NAME = "libPocoActiveRecord94-1.12.4-1.1.aarch64.rpm"
RPM_HASH = "ce9fcc77b6a4f8e40e5ffceb6e64273c2241f77cf55bd96e04ec49d66d7564eec0710cb88801f176a9a7dd684d59c36854dfb9fcd06bcff44b67a7fb8f277c1b"

RPROVIDES:${PN} += "libPocoActiveRecord.so.94 \
libPocoActiveRecord94"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoData.so.94 \
libPocoFoundation.so.94 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
