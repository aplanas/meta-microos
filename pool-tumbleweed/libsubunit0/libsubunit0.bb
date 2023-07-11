SUMMARY = "Binary libraries for subunit"
DESCRIPTION = "Binary libraries for subunit"
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "libsubunit0-1.4.2-2.4.aarch64.rpm"
RPM_HASH = "5d9f909cbaf2d0d4cd51d125f8bfe209c97fb1ecd408e941f331c3ab3a24487711a369d262f5f90521cc8fc404dbf93ecd9a1a19327f43ac0f08df1b208db9f5"

RPROVIDES:${PN} += "libsubunit.so.0 \
libsubunit0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
subunit"

inherit rpm
