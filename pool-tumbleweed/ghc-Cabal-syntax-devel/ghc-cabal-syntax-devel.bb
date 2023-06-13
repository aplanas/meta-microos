SUMMARY = "Haskell Cabal-syntax library development files"
DESCRIPTION = "This package provides the Haskell Cabal-syntax library development files."
LICENSE = "BSD-3-Clause"

PV = "3.8.1.0"

RPM_NAME = "ghc-Cabal-syntax-devel-3.8.1.0-3.1.aarch64.rpm"
RPM_HASH = "ccdfb4f344b1de77cfb0341f20e38667e53a5802f8d83d7c97c1c0612fae2168e6d91b735d4046343fae0af04e4d5748a05a0efbf9d40e92148d50763a778586"

RPROVIDES:${PN} += "ghc-Cabal-syntax-devel \
ghc-Cabal-syntax-devel(aarch-64) \
ghc-Cabal-syntax-static \
ghc-Cabal-syntax-static(aarch-64) \
ghc-devel(Cabal-syntax-3.8.1.0)"

RDEPENDS:${PN} += "ghc-Cabal-syntax(aarch-64) \
ghc-compiler \
ghc-devel(array-0.5.4.0) \
ghc-devel(base-4.17.1.0) \
ghc-devel(binary-0.8.9.1) \
ghc-devel(bytestring-0.11.4.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(deepseq-1.4.8.0) \
ghc-devel(directory-1.3.7.1) \
ghc-devel(filepath-1.4.2.2) \
ghc-devel(mtl-2.2.2) \
ghc-devel(parsec-3.1.16.1) \
ghc-devel(pretty-1.1.3.6) \
ghc-devel(text-2.0.2) \
ghc-devel(time-1.12.2) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(unix-2.7.3)"

inherit rpm
