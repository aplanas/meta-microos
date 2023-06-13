SUMMARY = "Library providing the FAM File Alteration Monitor API"
DESCRIPTION = "This C library provides an API and ABI compatible file alteration \
monitor mechanism compatible with FAM, but not dependent on a system wide \
daemon."
LICENSE = "LGPL-2.1-only"

PV = "0.1.10"

RPM_NAME = "libfam0-gamin-0.1.10-18.1.aarch64.rpm"
RPM_HASH = "b9435b368916b595ebe07f9afe0e5b70fbd22db1ac9e7e0539fade02e1bb9b8e10fa74b196aff5d5cd599a99e18683059a1d162db416afcf18b2e2d42b6c1bab"

RPROVIDES:${PN} += "libfam.so.0()(64bit) \
libfam0-gamin \
libfam0-gamin(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
gamin-server \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
