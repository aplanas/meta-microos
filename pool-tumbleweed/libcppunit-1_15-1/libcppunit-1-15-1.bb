SUMMARY = "Cppunit library for writting C++ unittests"
DESCRIPTION = "Cppunit library for writting C++ unittests in JUnit like fashion."
LICENSE = "LGPL-2.1-or-later"

PV = "1.15.1"

RPM_NAME = "libcppunit-1_15-1-1.15.1-1.13.aarch64.rpm"
RPM_HASH = "f1bf78160413a6f3aa2ac6cb1a30c96c8418697b82c002f81a9466c7b11d4a6105d13c3d6a46c41f30923ae861857032d3b3eca83e60671de34e83d1c633f5ca"

RPROVIDES:${PN} += "libcppunit-1-15-1 \
libcppunit-1.15.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
