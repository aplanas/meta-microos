SUMMARY = "Haskell postgresql-libpq library development files"
DESCRIPTION = "This package provides the Haskell postgresql-libpq library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.9.5.0"

RPM_NAME = "ghc-postgresql-libpq-devel-0.9.5.0-2.3.aarch64.rpm"
RPM_HASH = "9469e4dcc68d294ae1bd02e41eb6a9e9eca96db08073add9012c987c8d8d109ef566a9d0e7d9fba2d0d9780d26c51427d663ee2ae1d9400b2ae4592543a984e5"

RPROVIDES:${PN} += "ghc-devel(postgresql-libpq-0.9.5.0-EniLDQI99PgI2VDyTYHGox) \
ghc-postgresql-libpq-devel \
ghc-postgresql-libpq-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(unix-2.7.3) \
ghc-postgresql-libpq \
postgresql-server-devel"

inherit rpm
