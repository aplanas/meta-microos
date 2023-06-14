SUMMARY = "Haskell pretty-show library development files"
DESCRIPTION = "This package provides the Haskell pretty-show library development files."
LICENSE = "MIT"

PV = "1.10"

RPM_NAME = "ghc-pretty-show-devel-1.10-4.3.aarch64.rpm"
RPM_HASH = "b6ced624ff6599c5b97f46e406d03b4da7625fc2054bf4d5e0da7f0ef2faa179fb4fc6a1db1a19f87aeca0f029f10dc99794732a04d1c4b4fc60c7db66326a80"

RPROVIDES:${PN} += "ghc-devel-pretty-show-1.10-IA5YnfAP5DqIvEIFfcZVdd \
ghc-pretty-show-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-haskell-lexer-1.1.1-FBBQnuYVuwZ6NRUVHfUjFR \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-text-2.0.2 \
ghc-pretty-show"

inherit rpm
