SUMMARY = "POCO C++ Active Record"
DESCRIPTION = "ActiveRecord is a simple and lightweight object-relational mapping (ORM) \
framework based on the Active Record pattern and the Data library."
LICENSE = "BSL-1.0"

PV = "1.12.2"

RPM_NAME = "libPocoActiveRecord92-1.12.2-1.5.aarch64.rpm"
RPM_HASH = "9e791f3fe1bfa1fcd02de724946156f3e0e8b534bc9e0e3d53e1b471ba49dbb6324aa45efeddaa79691026db4225712c50f4e3fa4eefc960ecda4e2ce7fe9b0e"

RPROVIDES:${PN} += "libPocoActiveRecord.so.92 \
libPocoActiveRecord92"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libPocoData.so.92 \
libPocoFoundation.so.92 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
