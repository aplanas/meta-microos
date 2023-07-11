SUMMARY = "Include Files and Libraries for cppunit"
DESCRIPTION = "Cppunit library, headers, and all relevant additions for writting C++ unittests \
in JUnit like fashion."
LICENSE = "LGPL-2.1-or-later"

PV = "1.15.1"

RPM_NAME = "cppunit-devel-1.15.1-1.14.aarch64.rpm"
RPM_HASH = "ed599349dc12c43a42e5d9e1a3948689d738a1b0d9e476ab6a0bdd3b6737d63e8ac8054028f23fccb1192cfbc387cf5d5807c0b952ddb58bc986d45fc84de3a3"

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
