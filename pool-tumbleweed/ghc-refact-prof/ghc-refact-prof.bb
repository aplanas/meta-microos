SUMMARY = "Haskell refact profiling library"
DESCRIPTION = "This package provides the Haskell refact profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.3.0.2"

RPM_NAME = "ghc-refact-prof-0.3.0.2-4.3.aarch64.rpm"
RPM_HASH = "e225831dd0ee1ee02b50e18306f24b3af5b93eb047a957f3d8281789ed9a20c69f73e44acbc19cfb14918fed40d20b2859b9d880a701460defe3cb4dd300d47f"

RPROVIDES:${PN} += "ghc-prof-refact-0.3.0.2-BDNu2wr6P751Tb9dT06Yg8 \
ghc-refact-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-refact-devel"

inherit rpm
