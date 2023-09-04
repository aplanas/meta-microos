SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-test-15-2.12.noarch.rpm"
RPM_HASH = "58664744683a4cb9dbc12e77ea95bbf87551b5984a2a372d661f4f679554ba03be0667df181c25907ee8adedc889be10df678dcbdd201cc227dfb2c1f8313c9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-test \
postgresql-test-noarch"

RDEPENDS:${PN} += "postgresql-test-implementation"

inherit rpm
