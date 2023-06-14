SUMMARY = "Haskell HTTP library development files"
DESCRIPTION = "This package provides the Haskell HTTP library development files."
LICENSE = "BSD-3-Clause"

PV = "4000.4.1"

RPM_NAME = "ghc-HTTP-devel-4000.4.1-1.3.aarch64.rpm"
RPM_HASH = "96b270095fbebe6140cdf737770b10cb21ab886274fcc3a5fe1e67e5ad909f13de764b0e182658a17d687f619342b4b5db7e1e4b9bd68b2e322315da4012a723"

RPROVIDES:${PN} += "ghc-HTTP-devel \
ghc-devel-HTTP-4000.4.1-BsHtin5O4EoLpElKRODQk3"

RDEPENDS:${PN} += "/bin/sh \
ghc-HTTP \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-mtl-2.2.2 \
ghc-devel-network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd \
ghc-devel-network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2"

inherit rpm
