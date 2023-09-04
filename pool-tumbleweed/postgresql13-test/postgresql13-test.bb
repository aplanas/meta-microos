SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "13.12"

RPM_NAME = "postgresql13-test-13.12-1.1.aarch64.rpm"
RPM_HASH = "08cb7ec55aaa336b2478c7681cf87a9e744d1ae3a5607981b49adb7b0516b975f8f68f9fca0d158facebb4ad73de604e0f7fb62dc5ae3e60db5d912bcad4ce9b"

RPROVIDES:${PN} += "postgresql-test-implementation \
postgresql13-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql-test-noarch \
postgresql13-server"

inherit rpm
