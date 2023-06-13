SUMMARY = "Haskell array profiling library"
DESCRIPTION = "This package provides the Haskell array profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.4.0"

RPM_NAME = "ghc-array-prof-0.5.4.0-3.1.aarch64.rpm"
RPM_HASH = "596ee810072ffdd7d89520aa4b088419ff75713332cd87f61abde982992f9547be2043456968ba904787688b0780bdc4300883fae9362c43c3af85760226f448"

RPROVIDES:${PN} += "ghc-array-prof \
ghc-array-prof(aarch-64) \
ghc-prof(array-0.5.4.0)"

RDEPENDS:${PN} += "ghc-array-devel(aarch-64) \
ghc-prof(base-4.17.1.0)"

inherit rpm
