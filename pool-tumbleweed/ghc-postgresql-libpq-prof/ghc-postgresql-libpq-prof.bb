SUMMARY = "Haskell postgresql-libpq profiling library"
DESCRIPTION = "This package provides the Haskell postgresql-libpq profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.9.5.0"

RPM_NAME = "ghc-postgresql-libpq-prof-0.9.5.0-2.9.aarch64.rpm"
RPM_HASH = "05653ecdc514ec67f233e099a85022c3ee763c945cebf5a26eeb31a3247544edbc28e05233cd9214a6e8883cc118874181a55876509bb3f609b3affe974c47fa"

RPROVIDES:${PN} += "ghc-postgresql-libpq-prof \
ghc-prof-postgresql-libpq-0.9.5.0-LAEYJt6pIENHmjvWelVvQG"

RDEPENDS:${PN} += "ghc-postgresql-libpq-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-unix-2.7.3"

inherit rpm
