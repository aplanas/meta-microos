SUMMARY = "Haskell pretty-show library development files"
DESCRIPTION = "This package provides the Haskell pretty-show library development files."
LICENSE = "MIT"

PV = "1.10"

RPM_NAME = "ghc-pretty-show-devel-1.10-4.8.aarch64.rpm"
RPM_HASH = "1f241858f9db3b7bcfd1deeab0d7b64105393af7b09d178b9a430ca44b057224726970321eee93c46b693880d980e4746e40c5c728fbb0c7253d96f5ebccad64"

RPROVIDES:${PN} += "ghc-devel-pretty-show-1.10-FKBNqO5OmUpJSHpBLbk95K \
ghc-pretty-show-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-haskell-lexer-1.1.1-C14Cmw3wUWQ88vb32sfZ2Z \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-text-2.0.2 \
ghc-pretty-show"

inherit rpm
