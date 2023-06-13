SUMMARY = "Haskell unicode-transforms profiling library"
DESCRIPTION = "This package provides the Haskell unicode-transforms profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.0.1"

RPM_NAME = "ghc-unicode-transforms-prof-0.4.0.1-4.3.aarch64.rpm"
RPM_HASH = "e71dc9407130ad75b3e72d7be25b8b58e0793ee925a237ffbbbaffe8e387b22103b7f687ff170555dfa5863c373162ac5aeb85e66afd53f10968440e6c952d89"

RPROVIDES:${PN} += "ghc-prof(unicode-transforms-0.4.0.1-EKt5KzAvdneBwqiDZWg9HO) \
ghc-unicode-transforms-prof \
ghc-unicode-transforms-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(ghc-prim-0.9.0) \
ghc-prof(text-2.0.2) \
ghc-prof(unicode-data-0.4.0.1-IPznodd4J0BGoSZPR6u4lO) \
ghc-unicode-transforms-devel"

inherit rpm
