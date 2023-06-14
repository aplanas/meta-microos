SUMMARY = "Haskell postgresql-libpq profiling library"
DESCRIPTION = "This package provides the Haskell postgresql-libpq profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.5.0"

RPM_NAME = "ghc-postgresql-libpq-prof-0.9.5.0-2.3.aarch64.rpm"
RPM_HASH = "3ada23f814279b76edb8be87a346bdd66cacebb51469bf7892cf63faa9825f4775f2ee415cebb17ec790f28f1041fdb5dfef77ed2aeea0fe5d35ab32c3e92512"

RPROVIDES:${PN} += "ghc-postgresql-libpq-prof \
ghc-prof-postgresql-libpq-0.9.5.0-EniLDQI99PgI2VDyTYHGox"

RDEPENDS:${PN} += "ghc-postgresql-libpq-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-unix-2.7.3"

inherit rpm
