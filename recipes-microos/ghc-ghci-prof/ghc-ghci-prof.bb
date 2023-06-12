SUMMARY = "Haskell ghci profiling library"
DESCRIPTION = "This package provides the Haskell ghci profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghci-prof-9.4.5-3.1.aarch64.rpm"
RPM_HASH = "b37b657eeed9d690ba65131bc8e0e7c3adb7ebf17ac704423b71250caac937a5c314f8e9ff7e7b5d35fc75a61896a63aa3aa8df57cee2c3e2c4f6f33cddca3e6"

RPROVIDES:${PN} += "ghc-ghci-prof ghc-ghci-prof(aarch-64) ghc-prof(ghci-9.4.5)"
RDEPENDS:${PN} += "ghc-ghci-devel(aarch-64) ghc-prof(array-0.5.4.0) ghc-prof(base-4.17.1.0) ghc-prof(binary-0.8.9.1) ghc-prof(bytestring-0.11.4.0) ghc-prof(containers-0.6.7) ghc-prof(deepseq-1.4.8.0) ghc-prof(filepath-1.4.2.2) ghc-prof(ghc-boot-9.4.5) ghc-prof(ghc-heap-9.4.5) ghc-prof(ghc-prim-0.9.0) ghc-prof(rts-1.0.2) ghc-prof(template-haskell-2.19.0.0) ghc-prof(transformers-0.5.6.2) ghc-prof(unix-2.7.3)"

inherit rpm
