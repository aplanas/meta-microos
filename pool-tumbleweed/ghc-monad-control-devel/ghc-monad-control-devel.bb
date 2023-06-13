SUMMARY = "Haskell monad-control library development files"
DESCRIPTION = "This package provides the Haskell monad-control library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.3.1"

RPM_NAME = "ghc-monad-control-devel-1.0.3.1-2.2.aarch64.rpm"
RPM_HASH = "0338bd627dd6b77f0c0b31c5840f41b73dc839638cfd182c5e11e4c50748d94c3385149f0c26c91303379b5bf9d095b60f7ae6136004aa5d2838b62550481755"

RPROVIDES:${PN} += "ghc-devel(monad-control-1.0.3.1-YXA6op7GEFFtfFxLr4pzX) \
ghc-monad-control-devel \
ghc-monad-control-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(base-4.17.1.0) \
ghc-devel(stm-2.5.1.0) \
ghc-devel(transformers-0.5.6.2) \
ghc-devel(transformers-base-0.4.6-AlF1op8b8qY6wTtsY0MGEp) \
ghc-devel(transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd) \
ghc-monad-control"

inherit rpm
