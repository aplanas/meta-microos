SUMMARY = "Haskell ghc-heap library development files"
DESCRIPTION = "This package provides the Haskell ghc-heap library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-heap-devel-9.4.5-1.1.aarch64.rpm"
RPM_HASH = "b26da231db922ea516c458527f393baf2eff7b62e79cc4c4d986864563cfd7c9d461efbc646b7a33143ef7a9a0b505cb6a58d524968b0168a82136030e043ab6"

RPROVIDES:${PN} += "ghc-devel(ghc-heap-9.4.5) ghc-ghc-heap-devel ghc-ghc-heap-devel(aarch-64) ghc-ghc-heap-static ghc-ghc-heap-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(containers-0.6.7) ghc-devel(ghc-prim-0.9.0) ghc-devel(rts-1.0.2) ghc-ghc-heap(aarch-64)"

inherit rpm
