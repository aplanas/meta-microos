SUMMARY = "Redfish C Client Library"
DESCRIPTION = "libRedfish is a C client library that allows for Creation of Entities (POST), Read of Entities (GET), Update of Entities (PATCH), Deletion of Entities (DELETE), running Actions (POST), receiving events, and providing some basic query abilities."
LICENSE = "BSD-3-Clause"

PV = "1.3.6.4+git.a0788d4"

RPM_NAME = "libredfish-1.3.6.4+git.a0788d4-1.2.aarch64.rpm"
RPM_HASH = "b70e18e498f0d6af0ebaf085e8a26dc396751cc299a09e93782469993785cb6fe06f4af87ed73e650ca60513521aa120454f6307c0449db7f55f06c2502375e3"

RPROVIDES:${PN} += "libredfish \
libredfish(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libredfish.so.1()(64bit) \
readline"

inherit rpm
