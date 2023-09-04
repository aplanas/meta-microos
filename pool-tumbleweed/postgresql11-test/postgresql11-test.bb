SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "11.21"

RPM_NAME = "postgresql11-test-11.21-1.1.aarch64.rpm"
RPM_HASH = "adfc07b7a022864af6b9e2592242687cdcea3489822772504d24e64f9b8924910fc9dd5519cc651ffc4f24b924f425ec0233b1fc7f44db76ca0ca03f7786d5af"

RPROVIDES:${PN} += "postgresql-test-implementation \
postgresql11-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql-test-noarch \
postgresql11-server"

inherit rpm
