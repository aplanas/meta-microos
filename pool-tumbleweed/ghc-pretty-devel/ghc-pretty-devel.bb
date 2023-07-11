SUMMARY = "Haskell pretty library development files"
DESCRIPTION = "This package provides the Haskell pretty library development files."
LICENSE = "BSD-3-Clause"

PV = "1.1.3.6"

RPM_NAME = "ghc-pretty-devel-1.1.3.6-3.2.aarch64.rpm"
RPM_HASH = "66691207d94098bf57039482492c21d0e0668f05be1bceb40f54e00ead84a103f270c71a1f4796ccc8369327242bdbb2b22f05f7ef9f6f01fb46bd1984d91b3f"

RPROVIDES:${PN} += "ghc-devel-pretty-1.1.3.6 \
ghc-pretty-devel \
ghc-pretty-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-pretty"

inherit rpm
