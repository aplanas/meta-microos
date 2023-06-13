SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "12.15"

RPM_NAME = "postgresql12-test-12.15-1.2.aarch64.rpm"
RPM_HASH = "8b5ec6279995f110dd97377b839b5a7ab650271bc524a9ef48748d531281e7e41c545e6f89a8e68a9fe9096ffad0c95856dc1c11f426028fba85366d3ba39a9e"

RPROVIDES:${PN} += "postgresql-test-implementation \
postgresql12-test \
postgresql12-test(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
postgresql-test-noarch \
postgresql12-server"

inherit rpm
