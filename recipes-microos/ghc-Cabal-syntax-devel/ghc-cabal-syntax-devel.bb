SUMMARY = "Haskell Cabal-syntax library development files"
DESCRIPTION = "This package provides the Haskell Cabal-syntax library development files."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-Cabal-syntax-devel-3.8.1.0-1.1.aarch64.rpm"
RPM_HASH = "c310382f94decf10370c7ea634516ebba3ba068f50d0943251076ed5e7133fc22a8662da303cce551aca72b39395c36d46abd1600e59d8195adc914e9cf795e9"

RPROVIDES:${PN} += "ghc-Cabal-syntax-devel ghc-Cabal-syntax-devel(aarch-64) ghc-Cabal-syntax-static ghc-Cabal-syntax-static(aarch-64) ghc-devel(Cabal-syntax-3.8.1.0)"
RDEPENDS:${PN} += "ghc-Cabal-syntax(aarch-64) ghc-compiler ghc-devel(array-0.5.4.0) ghc-devel(base-4.17.1.0) ghc-devel(binary-0.8.9.1) ghc-devel(bytestring-0.11.4.0) ghc-devel(containers-0.6.7) ghc-devel(deepseq-1.4.8.0) ghc-devel(directory-1.3.7.1) ghc-devel(filepath-1.4.2.2) ghc-devel(mtl-2.2.2) ghc-devel(parsec-3.1.16.1) ghc-devel(pretty-1.1.3.6) ghc-devel(text-2.0.2) ghc-devel(time-1.12.2) ghc-devel(transformers-0.5.6.2) ghc-devel(unix-2.7.3)"

inherit rpm
