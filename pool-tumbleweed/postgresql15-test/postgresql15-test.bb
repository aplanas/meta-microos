SUMMARY = "The test suite for PostgreSQL"
DESCRIPTION = "This package contains the sources and pre-built binaries of various \
tests for the PostgreSQL database management system, including \
regression tests and benchmarks."
LICENSE = "PostgreSQL"

PV = "15.3"

RPM_NAME = "postgresql15-test-15.3-1.5.aarch64.rpm"
RPM_HASH = "8d7aa31207f9ae4a6a584b6ecb7ae774069ef0c9517e01a03820cce44a1c38cd50705c0ebb1252b42be04e171a0a8b5c2953f8644dc10cbdb59563d2123737c0"

RPROVIDES:${PN} += "postgresql-test-implementation \
postgresql15-test"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
postgresql-test-noarch \
postgresql15-server"

inherit rpm
