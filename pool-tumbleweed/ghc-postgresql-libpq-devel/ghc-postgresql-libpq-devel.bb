SUMMARY = "Haskell postgresql-libpq library development files"
DESCRIPTION = "This package provides the Haskell postgresql-libpq library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.9.5.0"

RPM_NAME = "ghc-postgresql-libpq-devel-0.9.5.0-2.7.aarch64.rpm"
RPM_HASH = "3153bd701cd748cf00325a126b3b8f137d48871861cd9932b5d8074d4b803a67933bb0eb4def47b0acc11304374a37b8e2bdc5d3e3d94aa17764c61d713ebcec"

RPROVIDES:${PN} += "ghc-devel-postgresql-libpq-0.9.5.0-EniLDQI99PgI2VDyTYHGox \
ghc-postgresql-libpq-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-unix-2.7.3 \
ghc-postgresql-libpq \
postgresql-server-devel"

inherit rpm
