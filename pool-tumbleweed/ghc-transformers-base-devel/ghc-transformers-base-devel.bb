SUMMARY = "Haskell transformers-base library development files"
DESCRIPTION = "This package provides the Haskell transformers-base library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.4.6"

RPM_NAME = "ghc-transformers-base-devel-0.4.6-2.3.aarch64.rpm"
RPM_HASH = "b70ed431a5cb79bff04da563826df0588d60f3473a83e6c2d4f060293096f36e2d9fe2585c4d7c97f30af584ce45274a371c066e1fac7f611c96f9aa51e424c9"

RPROVIDES:${PN} += "ghc-devel-transformers-base-0.4.6-FmWhyTNhU3u3qYTd28DG44 \
ghc-transformers-base-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-base-orphans-0.8.8.2-Ace67bhQsJ1lQVihVIKZ5 \
ghc-devel-stm-2.5.1.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-transformers-compat-0.7.2-2GbmZx5KxIlAJLN4VBqBUM \
ghc-transformers-base"

inherit rpm
