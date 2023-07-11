SUMMARY = "Development files for the hhdate library"
DESCRIPTION = "A date and time library based on the C++11/14/17 chrono header."
LICENSE = "MIT"

PV = "3.0.1"

RPM_NAME = "libdate-tz3-3.0.1-3.4.aarch64.rpm"
RPM_HASH = "3f3c7d040025fd4129da869d9ebf95775b692cbd7ba8ca6116dc5fef5d75e0d6f3458aca0cbdf50067b3de29e38ac4b49c6408e83d6de1a7935c8b1981734406"

RPROVIDES:${PN} += "libdate-tz.so.3 \
libdate-tz3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
