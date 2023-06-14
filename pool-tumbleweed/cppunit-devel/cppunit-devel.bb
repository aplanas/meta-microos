SUMMARY = "Include Files and Libraries for cppunit"
DESCRIPTION = "Cppunit library, headers, and all relevant additions for writting C++ unittests \
in JUnit like fashion."
LICENSE = "LGPL-2.1-or-later"

PV = "1.15.1"

RPM_NAME = "cppunit-devel-1.15.1-1.13.aarch64.rpm"
RPM_HASH = "75a9701efc298f130a13519aca357aaad69e57e37e46df1499225922aba4551e69b5e0ffada79f3b90a3e87aff0f4751039bce7e45d871922fe8fde4dab106f9"

RPROVIDES:${PN} += "cppunit-devel \
libcppunit-devel \
pkgconfig-cppunit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcppunit-1-15-1 \
libcppunit-1.15.so.1 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
