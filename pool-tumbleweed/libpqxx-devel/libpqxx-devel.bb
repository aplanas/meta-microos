SUMMARY = "C++ Client Library for PostgreSQL"
DESCRIPTION = "This package contains header files needed for writing \
C++ programs that connect to a PostgreSQL database."
LICENSE = "BSD-3-Clause"

PV = "6.4.5"

RPM_NAME = "libpqxx-devel-6.4.5-1.20.aarch64.rpm"
RPM_HASH = "df0e1f8c2080f0bda88d7cfff7ecc6c8c4f27e31dc98a41ae55142aef2631feefaa2b2c38ece9db442de483b51bbf4c79ff071cf23a73bd7788580b123c55df6"

RPROVIDES:${PN} += "libpqxx-devel \
pkgconfig-libpqxx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpqxx-6-4"

inherit rpm
