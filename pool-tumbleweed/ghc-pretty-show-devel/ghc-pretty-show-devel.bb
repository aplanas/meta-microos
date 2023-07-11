SUMMARY = "Haskell pretty-show library development files"
DESCRIPTION = "This package provides the Haskell pretty-show library development files."
LICENSE = "MIT"

PV = "1.10"

RPM_NAME = "ghc-pretty-show-devel-1.10-4.6.aarch64.rpm"
RPM_HASH = "f7bb90d602f50e32a7f84938b707dff19d1f68b33cc68a9749f0c2192754c1ec6917f151893163ee545910a28af7de60cd5f6a365c7fc237bda91687e8365cce"

RPROVIDES:${PN} += "ghc-devel-pretty-show-1.10-IA5YnfAP5DqIvEIFfcZVdd \
ghc-pretty-show-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
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
