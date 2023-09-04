SUMMARY = "Haskell template-haskell profiling library"
DESCRIPTION = "This package provides the Haskell template-haskell profiling library."
LICENSE = "BSD-3-Clause"

PV = "2.19.0.0"

RPM_NAME = "ghc-template-haskell-prof-2.19.0.0-1.1.aarch64.rpm"
RPM_HASH = "c607d508bd8cae1d5a9d36f6474e35b1a52e03336347138382d948dcbd42c97b17b9c6c9971189de9be759c58a9ac39555dd63c09907b36c76c63745e2408707"

RPROVIDES:${PN} += "ghc-prof-template-haskell-2.19.0.0 \
ghc-template-haskell-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-ghc-boot-th-9.4.6 \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-pretty-1.1.3.6 \
ghc-template-haskell-devel"

inherit rpm
