SUMMARY = "Haskell parsec library development files"
DESCRIPTION = "This package provides the Haskell parsec library development files."
LICENSE = "BSD-3-Clause"

PV = "3.1.16.1"

RPM_NAME = "ghc-parsec-devel-3.1.16.1-1.1.aarch64.rpm"
RPM_HASH = "27103a9450df30f4e50729339a3a929ab0cf6a54b8d0b91a381364cebe6b44fbdc04021524d401548e0a9ce2f1960ebbe64dee908c3526870b759e4afec60b7d"

RPROVIDES:${PN} += "ghc-devel-parsec-3.1.16.1 \
ghc-parsec-devel \
ghc-parsec-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-mtl-2.2.2 \
ghc-devel-text-2.0.2 \
ghc-parsec"

inherit rpm
