SUMMARY = "Haskell mtl profiling library"
DESCRIPTION = "This package provides the Haskell mtl profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "ghc-mtl-prof-2.2.2-3.1.aarch64.rpm"
RPM_HASH = "e140932cfe2641bc90773ddc599f78ac81ca998b486b9f9b01fa861817e3ac68ebba2354d2b9f8b97af8ef562ac54179b9cefb8416a68105b85eb1d787f2ef38"

RPROVIDES:${PN} += "ghc-mtl-prof \
ghc-mtl-prof(aarch-64) \
ghc-prof(mtl-2.2.2)"

RDEPENDS:${PN} += "ghc-mtl-devel(aarch-64) \
ghc-prof(base-4.17.1.0) \
ghc-prof(transformers-0.5.6.2)"

inherit rpm
