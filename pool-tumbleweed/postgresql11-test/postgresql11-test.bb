SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "11.20"

RPM_NAME = "postgresql11-test-11.20-1.2.aarch64.rpm"
RPM_HASH = "1eedfa379c3420e740a6bb4f66e74fbf0e7a71da40b7f1c3d0d9cdc33a96321a4837602d1197aab15037d76fee01554f312460a9b2f261ffcbe742d6349fae9a"

RPROVIDES:${PN} += "postgresql-test-implementation \
postgresql11-test \
postgresql11-test(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
postgresql-test-noarch \
postgresql11-server"

inherit rpm
