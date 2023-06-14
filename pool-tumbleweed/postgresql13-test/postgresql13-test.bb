SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "13.11"

RPM_NAME = "postgresql13-test-13.11-1.2.aarch64.rpm"
RPM_HASH = "b27dd8f8404fd841ba5d5768599d215f6a892e32e8f136e64184e6bda233fe7500705f5e7bd598a08d8bbe36b9081bc2a4494905babf52aa1ec4d8e5e8762705"

RPROVIDES:${PN} += "postgresql-test-implementation \
postgresql13-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql-test-noarch \
postgresql13-server"

inherit rpm
