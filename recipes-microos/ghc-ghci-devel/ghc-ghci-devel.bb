SUMMARY = "Haskell ghci library development files"
DESCRIPTION = "This package provides the Haskell ghci library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghci-devel-9.4.5-1.1.aarch64.rpm"
RPM_HASH = "9af8ae7d785bc5eb76fbe2a915dcb75a45f6caf4f0a82e8a30774a0711b08894b2d1042022b79c212b9d799e7a1d6e79275bba604b7bcbfe503fc904b4de070a"

RPROVIDES:${PN} += "ghc-devel(ghci-9.4.5) ghc-ghci-devel ghc-ghci-devel(aarch-64) ghc-ghci-static ghc-ghci-static(aarch-64)"
RDEPENDS:${PN} += "ghc-compiler ghc-devel(array-0.5.4.0) ghc-devel(base-4.17.1.0) ghc-devel(binary-0.8.9.1) ghc-devel(bytestring-0.11.4.0) ghc-devel(containers-0.6.7) ghc-devel(deepseq-1.4.8.0) ghc-devel(filepath-1.4.2.2) ghc-devel(ghc-boot-9.4.5) ghc-devel(ghc-heap-9.4.5) ghc-devel(ghc-prim-0.9.0) ghc-devel(rts-1.0.2) ghc-devel(template-haskell-2.19.0.0) ghc-devel(transformers-0.5.6.2) ghc-devel(unix-2.7.3) ghc-ghci(aarch-64)"

inherit rpm
