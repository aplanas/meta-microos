SUMMARY = "Haskell exceptions library development files"
DESCRIPTION = "This package provides the Haskell exceptions library development files."
LICENSE = "BSD-3-Clause"

PV = "0.10.5"

RPM_NAME = "ghc-exceptions-devel-0.10.5-3.1.aarch64.rpm"
RPM_HASH = "0be8a273032eaf0534698309d42b684d2f4383e168a00454aff3d6dd7b3e908cc5f01212317f1a21f55183b74506dbfdd5b555b4e70e825cc992247da32efd42"

RPROVIDES:${PN} += "ghc-devel-exceptions-0.10.5 \
ghc-exceptions-devel \
ghc-exceptions-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-mtl-2.2.2 \
ghc-devel-stm-2.5.1.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-exceptions"

inherit rpm
