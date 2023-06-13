SUMMARY = "File compression program"
DESCRIPTION = "Zip is a compression and file packaging utility. It is compatible with \
PKZIP(tm) 2.04g (Phil Katz ZIP) for MS-DOS systems."
LICENSE = "BSD-3-Clause"

PV = "3.0"

RPM_NAME = "zip-3.0-22.5.aarch64.rpm"
RPM_HASH = "6cb0021e0ec21b358be486ab4de4396932f5cbfe33beac9cd957e9560b83bec34fdccf8a3a23b6495e5a1846d23bffff96c4a9e14b1af59bdd1ae8979e9c2bb4"

RPROVIDES:${PN} += "crzip \
zip \
zip(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libbz2.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
