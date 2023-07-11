SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "14.8"

RPM_NAME = "postgresql14-test-14.8-1.5.aarch64.rpm"
RPM_HASH = "23ece8ea949b637273a1f6550b21ee58b8390766eb8149d202ac832fcae34602867043f9062f2f565cc23c3fef6352a9faf171f9b32a5e3efbb946418665aaeb"

RPROVIDES:${PN} += "postgresql-test-implementation \
postgresql14-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql-test-noarch \
postgresql14-server"

inherit rpm
