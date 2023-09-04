SUMMARY = "Subunit integration into cppunit"
DESCRIPTION = "Subunit integration into cppunit."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "libcppunit_subunit0-1.4.2-3.2.aarch64.rpm"
RPM_HASH = "9e06a14a4ceea338813194707d5ab718daa71ca82cce6750dcbd5406b7f929884e97ef2e5aba391cc7114865f7cfeea23c0889c3e3c111b20457d894248c1431"

RPROVIDES:${PN} += "libcppunit-subunit.so.0 \
libcppunit-subunit0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
subunit"

inherit rpm
