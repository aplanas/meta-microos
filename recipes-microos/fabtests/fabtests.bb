SUMMARY = "Test suite for libfabric API"
DESCRIPTION = "Fabtests provides a set of examples that uses libfabric, a fabric software library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "1.18.0"

RPM_NAME = "fabtests-1.18.0-1.1.aarch64.rpm"
RPM_HASH = "3ea73d346affa3d388ffba844a2ed98d546afb3227ce16d7db048b9804443ecba0146b9e78b1dcad23198ae2bd71e77403cf12969533501a0d625db748d18de5"

RPROVIDES:${PN} += "fabtests fabtests(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /usr/bin/env ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfabric.so.1()(64bit) libfabric.so.1(FABRIC_1.0)(64bit) libfabric.so.1(FABRIC_1.1)(64bit) libfabric.so.1(FABRIC_1.3)(64bit)"

inherit rpm
