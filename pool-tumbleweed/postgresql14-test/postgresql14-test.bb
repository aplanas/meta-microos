SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "14.8"

RPM_NAME = "postgresql14-test-14.8-1.2.aarch64.rpm"
RPM_HASH = "e8cc9b16fff4f30d21441c4630e8ad7adf9e3638fb1f24215f04fa1f7dde8f9cb0c3d8ba4c81391ab1b457f0ae62595babff0812288e69fea8457d7a28ad58b8"

RPROVIDES:${PN} += "postgresql-test-implementation \
postgresql14-test \
postgresql14-test(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
postgresql-test-noarch \
postgresql14-server"

inherit rpm
