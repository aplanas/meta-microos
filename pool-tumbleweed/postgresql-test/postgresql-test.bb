SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "15"

RPM_NAME = "postgresql-test-15-2.7.noarch.rpm"
RPM_HASH = "bc551289da7990cd950bf651ad5bf88045acdb580cead4ba3f9ec6280059fd6fbabf3e8c9d73c245bacb7b54b1ef890fc898e87c66955ecb6cbd414923e8152e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "postgresql-test \
postgresql-test-noarch"

RDEPENDS:${PN} += "postgresql-test-implementation"

inherit rpm
