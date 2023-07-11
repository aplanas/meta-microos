SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "13.11"

RPM_NAME = "postgresql13-test-13.11-1.5.aarch64.rpm"
RPM_HASH = "fe0c7b00b3609f7991bfee3bb8c9715cffaed7995e90ea9d7006d6c1dbcadbd6a76d950c711551b66ef10d1581760d39a139425badf074eaa179b65459596238"

RPROVIDES:${PN} += "postgresql-test-implementation \
postgresql13-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql-test-noarch \
postgresql13-server"

inherit rpm
