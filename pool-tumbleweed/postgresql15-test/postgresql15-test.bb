SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "15.4"

RPM_NAME = "postgresql15-test-15.4-1.1.aarch64.rpm"
RPM_HASH = "e642bf31d807f2535006100f7977d649816ced3c2c1a07e8e175fdd2790dfbfdc8f0e24a4ab75e2d20f6d6a9301b8d70d2ceb65ff51712ab5e23168d760c0365"

RPROVIDES:${PN} += "postgresql-test-implementation \
postgresql15-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql-test-noarch \
postgresql15-server"

inherit rpm
