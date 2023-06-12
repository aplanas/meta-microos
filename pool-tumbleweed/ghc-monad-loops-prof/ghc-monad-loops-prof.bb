SUMMARY = "Haskell monad-loops profiling library"
DESCRIPTION = "This package provides the Haskell monad-loops profiling library."
LICENSE = "SUSE-Public-Domain"

PV = "0.4.3"

RPM_NAME = "ghc-monad-loops-prof-0.4.3-11.2.aarch64.rpm"
RPM_HASH = "07443ef1c540e47e12c45b2a6d0712e6b5f8354a4134b0f639cb2e16ab0a8092220ae0ef3ba6b61e811e8268bb2b40167a1bc93f24ebdac6fb9afd906e0655c7"

RPROVIDES:${PN} += "ghc-monad-loops-prof \
ghc-monad-loops-prof(aarch-64) \
ghc-prof(monad-loops-0.4.3-J6SAcCDTGblA6407vWEwF9)"
RDEPENDS:${PN} += "ghc-monad-loops-devel \
ghc-prof(base-4.17.1.0)"

inherit rpm
