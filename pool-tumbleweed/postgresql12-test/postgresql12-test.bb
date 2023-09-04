SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "12.16"

RPM_NAME = "postgresql12-test-12.16-1.1.aarch64.rpm"
RPM_HASH = "600c997e210f6053ed27f6f3b16456a582f84c154f4b93646321ccbff0a68ec02a2f181b732c4382e3e6ec6faf918de5a1d15c5d1dbc2eac237d56e50886a756"

RPROVIDES:${PN} += "postgresql-test-implementation \
postgresql12-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql-test-noarch \
postgresql12-server"

inherit rpm
