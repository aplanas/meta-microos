SUMMARY = "Haskell foldable1-classes-compat library development files"
DESCRIPTION = "This package provides the Haskell foldable1-classes-compat library \
development files."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-foldable1-classes-compat-devel-0.1-1.3.aarch64.rpm"
RPM_HASH = "b5716448623d98001f91dab73d1469eef3c3670d95d1ae5ce462db900cb1b6db5bdc893f088d69c37664b21faf8860b10ea3ffa4e36870a82f9d8d10e1edda3f"

RPROVIDES:${PN} += "ghc-devel-foldable1-classes-compat-0.1-JP9wXcYYGsT10VsvIV9rpl \
ghc-foldable1-classes-compat-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa \
ghc-devel-transformers-0.5.6.2 \
ghc-foldable1-classes-compat"

inherit rpm
