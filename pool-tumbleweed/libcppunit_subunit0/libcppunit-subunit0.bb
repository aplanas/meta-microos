SUMMARY = "Subunit integration into cppunit"
DESCRIPTION = "Subunit integration into cppunit."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "libcppunit_subunit0-1.4.2-2.2.aarch64.rpm"
RPM_HASH = "b9567f04a4dea01c129dd2cddd53ed2e38a4556828cf4e5ae12387e7dce9fa68def06dc0257a04f86b2b98878916e7e303c4b4bd057e08f5b5c6b8f0e9bc0fcb"

RPROVIDES:${PN} += "libcppunit-subunit.so.0 \
libcppunit-subunit0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
subunit"

inherit rpm
