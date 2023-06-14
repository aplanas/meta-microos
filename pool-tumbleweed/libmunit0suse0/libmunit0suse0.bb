SUMMARY = "Unit testing framework for C"
DESCRIPTION = "µnit is a unit testing framework for C. \
 * Assertion macros which make for nice error messages. \
 * Repeatable cross-platform random number generation, including \
   support for supplying a seed via CLI. \
 * Timing of both wall-clock and CPU time. \
 * Parameterized tests, nested test suites."
LICENSE = "MIT"

PV = "0.2.0+git38"

RPM_NAME = "libmunit0suse0-0.2.0+git38-2.10.aarch64.rpm"
RPM_HASH = "38794f7fd82f71a1bc03147e7c7af1c9dac055e90816610623b64556d1e1ccce800686237cb8949d3f06419f06cb1d1c7453a7449e23ec41b8ac18d6b2635cf8"

RPROVIDES:${PN} += "libmunit.so.0suse0 \
libmunit0suse0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
