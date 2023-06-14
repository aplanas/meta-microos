SUMMARY = "Haskell transformers-compat library development files"
DESCRIPTION = "This package provides the Haskell transformers-compat library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.7.2"

RPM_NAME = "ghc-transformers-compat-devel-0.7.2-2.3.aarch64.rpm"
RPM_HASH = "114b11681cb5f8424827bf0d8eb6cb5836aea73cc49959f8df58e6de3e1f25422ae55a0dd44e82dad9460b93b009c90a016cddbc9ae9f74b747be2740481c853"

RPROVIDES:${PN} += "ghc-devel-transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd \
ghc-transformers-compat-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-transformers-compat"

inherit rpm
