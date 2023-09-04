SUMMARY = "Haskell distributive library development files"
DESCRIPTION = "This package provides the Haskell distributive library development files."
LICENSE = "BSD-2-Clause"

PV = "0.6.2.1"

RPM_NAME = "ghc-distributive-devel-0.6.2.1-3.4.aarch64.rpm"
RPM_HASH = "5480f28db914ba65a0aa46a62f2f7dd6e3bcb29dfa85931cbdd5c726b420ace78faa8ce6a9e1ec8e0277a541de3d623fc14e2ba9dd5f51ca5e78c70feae136e9"

RPROVIDES:${PN} += "ghc-devel-distributive-0.6.2.1-7gHlNDSCz3vFkde299iroS \
ghc-distributive-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-base-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5 \
ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-devel-transformers-0.5.6.2 \
ghc-distributive"

inherit rpm
