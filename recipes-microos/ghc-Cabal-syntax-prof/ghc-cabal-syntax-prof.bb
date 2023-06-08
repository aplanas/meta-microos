SUMMARY = "Haskell Cabal-syntax profiling library"
DESCRIPTION = "This package provides the Haskell Cabal-syntax profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-Cabal-syntax-prof-3.8.1.0-1.1.aarch64.rpm"
RPM_HASH = "ca19273cac8e6d86f3561142d1f893c1f5864fab866f6275d57114ca6d074e914360f7b3b309519fe9b8977e5a33a70aa626b252d56b340d90b760d64e365bb0"

RPROVIDES:${PN} += "ghc-Cabal-syntax-prof ghc-Cabal-syntax-prof(aarch-64) ghc-prof(Cabal-syntax-3.8.1.0)"
RDEPENDS:${PN} += "ghc-Cabal-syntax-devel(aarch-64) ghc-prof(array-0.5.4.0) ghc-prof(base-4.17.1.0) ghc-prof(binary-0.8.9.1) ghc-prof(bytestring-0.11.4.0) ghc-prof(containers-0.6.7) ghc-prof(deepseq-1.4.8.0) ghc-prof(directory-1.3.7.1) ghc-prof(filepath-1.4.2.2) ghc-prof(mtl-2.2.2) ghc-prof(parsec-3.1.16.1) ghc-prof(pretty-1.1.3.6) ghc-prof(text-2.0.2) ghc-prof(time-1.12.2) ghc-prof(transformers-0.5.6.2) ghc-prof(unix-2.7.3)"

inherit rpm
