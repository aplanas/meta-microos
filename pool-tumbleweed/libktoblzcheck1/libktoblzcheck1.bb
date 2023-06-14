SUMMARY = "Shared Libraries for ktoblzcheck"
DESCRIPTION = "This package contains shared Libraries for ktoblzcheck."
LICENSE = "LGPL-2.1-only"

PV = "1.53"

RPM_NAME = "libktoblzcheck1-1.53-1.4.aarch64.rpm"
RPM_HASH = "9049494ea8e8efb6be373a5da6997a79fa5977a8f1b005cf525153b343642eaf00d149a80f4c19c84c03c4a7e7c41200052b2dd07712057bb7697d043b009313"

RPROVIDES:${PN} += "libktoblzcheck.so.1 \
libktoblzcheck1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
