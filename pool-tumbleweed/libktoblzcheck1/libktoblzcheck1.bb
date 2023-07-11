SUMMARY = "Shared Libraries for ktoblzcheck"
DESCRIPTION = "This package contains shared Libraries for ktoblzcheck."
LICENSE = "LGPL-2.1-only"

PV = "1.53"

RPM_NAME = "libktoblzcheck1-1.53-1.5.aarch64.rpm"
RPM_HASH = "facda9170ff13ee72ceb81df4504f87a97c18f54da13b800997cff82216f3fdfb2fce3bbe253deec83938182fe954a2ef3735633b61cfcdd6f16bed50907f162"

RPROVIDES:${PN} += "libktoblzcheck.so.1 \
libktoblzcheck1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
