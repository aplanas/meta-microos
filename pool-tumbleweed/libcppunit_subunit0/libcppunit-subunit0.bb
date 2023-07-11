SUMMARY = "Subunit integration into cppunit"
DESCRIPTION = "Subunit integration into cppunit."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "libcppunit_subunit0-1.4.2-2.4.aarch64.rpm"
RPM_HASH = "1e71986b946c81f6aef2b102c7fe771c49631e7d93728625033252cd6dd6a6a1e77584049e536a6b3ba04fc1d3f51ed5857c47239143800ff355ba29991fd05e"

RPROVIDES:${PN} += "libcppunit-subunit.so.0 \
libcppunit-subunit0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
subunit"

inherit rpm
