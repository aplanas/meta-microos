SUMMARY = "Haskell hashable profiling library"
DESCRIPTION = "This package provides the Haskell hashable profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.4.2.0"

RPM_NAME = "ghc-hashable-prof-1.4.2.0-1.3.aarch64.rpm"
RPM_HASH = "421d4d7d0056ec8e534b7688b9d25843588c84797f2642d4267924557bd614280e66037070eda002015cdee74c416ba10637f2d76ff669c8540779bc09bf3beb"

RPROVIDES:${PN} += "ghc-hashable-prof ghc-hashable-prof(aarch-64) ghc-prof(hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt)"
RDEPENDS:${PN} += "ghc-hashable-devel ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(containers-0.6.7) ghc-prof(deepseq-1.4.8.0) ghc-prof(filepath-1.4.2.2) ghc-prof(ghc-bignum-1.3) ghc-prof(ghc-prim-0.9.0) ghc-prof(text-2.0.2)"

inherit rpm
