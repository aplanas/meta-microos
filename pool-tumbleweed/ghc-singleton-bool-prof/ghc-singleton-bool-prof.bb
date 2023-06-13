SUMMARY = "Haskell singleton-bool profiling library"
DESCRIPTION = "This package provides the Haskell singleton-bool profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.6"

RPM_NAME = "ghc-singleton-bool-prof-0.1.6-4.2.aarch64.rpm"
RPM_HASH = "3a5056e8fff1194bf035035992aca39ddb111738e2264d76d5873a0b4b12957e94b5399ec0306aa5912c2cc1bfdf3437cb6e6dcf2e13303e576774d4a768a8d3"

RPROVIDES:${PN} += "ghc-prof(singleton-bool-0.1.6-9MbEj8pBx4EB1jZ66FdPc4) \
ghc-singleton-bool-prof \
ghc-singleton-bool-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(boring-0.2.1-J8lJX6Vz53r2bssyBwOtpl) \
ghc-prof(dec-0.0.5-4k85S2UkQTWCpK3j0IuOFm) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(some-1.0.5-3dwCpkSImpx8T8axxRPR3Z) \
ghc-singleton-bool-devel"

inherit rpm
