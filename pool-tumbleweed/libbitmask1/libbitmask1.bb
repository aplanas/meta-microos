SUMMARY = "Multi-word bitmask abstract data type (used by cpusets)"
DESCRIPTION = "The Cpuset System is a processor and memory placement mechanism that \
The libbitmask package provides an abstract data type for arbitrary \
length bit masks, with a variety of operators.	The cpuset package \
depends on libbitmask."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0"

RPM_NAME = "libbitmask1-2.0-29.7.aarch64.rpm"
RPM_HASH = "39333fc453364026ed39346cde2a7d085542ca84d9d30f47a2c13db0cbee096f4d132e7ff13063e5043df497246c8817f971f0aacd94da254d46cbd6ce2137d1"

RPROVIDES:${PN} += "libbitmask.so.1()(64bit) \
libbitmask1 \
libbitmask1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
