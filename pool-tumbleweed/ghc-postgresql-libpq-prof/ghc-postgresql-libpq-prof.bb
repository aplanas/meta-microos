SUMMARY = "Haskell postgresql-libpq profiling library"
DESCRIPTION = "This package provides the Haskell postgresql-libpq profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.5.0"

RPM_NAME = "ghc-postgresql-libpq-prof-0.9.5.0-2.7.aarch64.rpm"
RPM_HASH = "091869e5ace1577a05853ac32974e0f3dde2ed5336120d8778b037ce13112531f7b62e8419d73d5212a4d31bb3ce2832f4234600b8678b9108d95a3e08d7fc28"

RPROVIDES:${PN} += "ghc-postgresql-libpq-prof \
ghc-prof-postgresql-libpq-0.9.5.0-EniLDQI99PgI2VDyTYHGox"

RDEPENDS:${PN} += "ghc-postgresql-libpq-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-unix-2.7.3"

inherit rpm
