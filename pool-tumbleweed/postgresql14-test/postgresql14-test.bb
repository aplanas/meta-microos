SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "14.8"

RPM_NAME = "postgresql14-test-14.8-1.6.aarch64.rpm"
RPM_HASH = "531c738c22e5d09bf7e39eaa75ed22bf660e82be8ab8ab5fb765f4070e5bd73ae8142f80bfe2c548b271569676349159541c22d66ce27cc1aa970bab102f4ec1"

RPROVIDES:${PN} += "postgresql-test-implementation \
postgresql14-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql-test-noarch \
postgresql14-server"

inherit rpm
