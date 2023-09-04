SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.2.1+git7683"

RPM_NAME = "libm2pim18-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "5ee9c3e010082d63bb0eff92d53ac30d90fc8c418e9b219a90beb28ca71058eeba5715503aa914afaf62b157c1fb586fc1e8757363b9653424d2d134b610b315"

RPROVIDES:${PN} += "libm2pim.so.18 \
libm2pim18"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6"

inherit rpm
