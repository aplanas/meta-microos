SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "11.20"

RPM_NAME = "postgresql11-test-11.20-1.5.aarch64.rpm"
RPM_HASH = "d8cb9e0727fffc6e6f88cd61c3d289e9019f5888ec096093b4bdca723c1b799f92bc7689867ba2b4007b405f34cdde571a0a91f267eb6c692df2bb2c5c97c1b4"

RPROVIDES:${PN} += "postgresql-test-implementation \
postgresql11-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql-test-noarch \
postgresql11-server"

inherit rpm
