SUMMARY = "Haskell text library development files"
DESCRIPTION = "This package provides the Haskell text library development files."
LICENSE = "BSD-3-Clause"

PV = "2.0.2"

RPM_NAME = "ghc-text-devel-2.0.2-1.1.aarch64.rpm"
RPM_HASH = "cc6193ed870452d2a72c7be713b87b723b7e292225749989896c951eb296fc727bc5f20545ed8d5d0631a69c8b018a8f540b9c54d3f1bfce5da6d6716ae19df0"

RPROVIDES:${PN} += "ghc-devel-text-2.0.2 \
ghc-text-devel \
ghc-text-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-text"

inherit rpm
