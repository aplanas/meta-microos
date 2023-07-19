SUMMARY = "Subunit integration into cppunit"
DESCRIPTION = "Subunit integration into cppunit."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "libcppunit_subunit0-1.4.2-3.1.aarch64.rpm"
RPM_HASH = "800727ac03c7b26dfbb6fdbce4004dd9771bb427d16c5088cf3ec5e8208c4efda39c1f26ac3ab64be828e2e0861e377431829495f8828a402a633f6ddfcecd5b"

RPROVIDES:${PN} += "libcppunit-subunit.so.0 \
libcppunit-subunit0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
subunit"

inherit rpm
