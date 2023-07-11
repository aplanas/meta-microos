SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "12.15"

RPM_NAME = "postgresql12-test-12.15-1.5.aarch64.rpm"
RPM_HASH = "84d3dc8890fcb734cb54cc7ab19af5626e385efe5a8df29317020431ebe8dba695e14c62fb34159e3b7a8a9985afbc0d0a179c3b30497f4393b9101fa43e9785"

RPROVIDES:${PN} += "postgresql-test-implementation \
postgresql12-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql-test-noarch \
postgresql12-server"

inherit rpm
