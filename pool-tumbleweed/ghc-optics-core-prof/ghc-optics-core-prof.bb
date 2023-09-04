SUMMARY = "Haskell optics-core profiling library"
DESCRIPTION = "This package provides the Haskell optics-core profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.1.1"

RPM_NAME = "ghc-optics-core-prof-0.4.1.1-1.4.aarch64.rpm"
RPM_HASH = "484fd01768a7c0196d11bba38800e284755eafd58d93a0d9b0f75fd63dee55cf91da9d2869da60aebe84bb875b7f01fc9d0ceae0a1ad038b9175c6ff62e116a1"

RPROVIDES:${PN} += "ghc-optics-core-prof \
ghc-prof-optics-core-0.4.1.1-GFxq3hBCaeZX1WvuRPRZs"

RDEPENDS:${PN} += "ghc-optics-core-devel \
ghc-prof-array-0.5.4.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-indexed-profunctors-0.1.1.1-8VFnw8ahpDVCAreg6vEIe9 \
ghc-prof-indexed-traversable-0.1.2.1-4MWkBnFErvq3PVvZRvlACO \
ghc-prof-transformers-0.5.6.2"

inherit rpm
