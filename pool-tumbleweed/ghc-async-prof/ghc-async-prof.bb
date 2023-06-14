SUMMARY = "Haskell async profiling library"
DESCRIPTION = "This package provides the Haskell async profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.2.4"

RPM_NAME = "ghc-async-prof-2.2.4-4.2.aarch64.rpm"
RPM_HASH = "65cf1cc018b5609af86e56c554bf20bbddea0126d192a62d6f3331da58b02a6a7d1b833275ec4fdd72f111d15dbf90fb20b04f34eed906612c12d134cb7fb8af"

RPROVIDES:${PN} += "ghc-async-prof \
ghc-prof-async-2.2.4-Is3H7ZPNMkM5reIoCaqYrF"

RDEPENDS:${PN} += "ghc-async-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-stm-2.5.1.0"

inherit rpm
