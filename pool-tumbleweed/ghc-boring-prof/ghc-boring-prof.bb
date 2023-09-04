SUMMARY = "Haskell boring profiling library"
DESCRIPTION = "This package provides the Haskell boring profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-boring-prof-0.2.1-1.4.aarch64.rpm"
RPM_HASH = "ba98f0027c0390b1825a084af864e54d33503357768ed7dc74253982428cdcbf1a6bf94430d88c336c2d6b940725b8bac7151baf570d8519550f0e9fb3313987"

RPROVIDES:${PN} += "ghc-boring-prof \
ghc-prof-boring-0.2.1-8UoR96J8uAp13B13xTdCnI"

RDEPENDS:${PN} += "ghc-boring-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-prof-transformers-0.5.6.2"

inherit rpm
