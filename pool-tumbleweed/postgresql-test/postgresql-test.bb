SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-test-15-2.10.noarch.rpm"
RPM_HASH = "ac11f8238a3da007bf1c5dd6754d80fb43f5092ac0d802239f05e9322ea511182960636d36974a194cb5705687a6d1561e3607c8b15cb513dabd30591ab01424"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-test \
postgresql-test-noarch"

RDEPENDS:${PN} += "postgresql-test-implementation"

inherit rpm
