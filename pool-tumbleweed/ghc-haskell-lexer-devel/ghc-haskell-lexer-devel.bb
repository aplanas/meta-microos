SUMMARY = "Haskell haskell-lexer library development files"
DESCRIPTION = "This package provides the Haskell haskell-lexer library development files."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ghc-haskell-lexer-devel-1.1.1-2.8.aarch64.rpm"
RPM_HASH = "756c13b8bde1fb135a2f2dde1b60af0750587a4efd8aef7dc74fca14e4614055ef06f392ad8d43e37c750d3f04e26555770e97e8f8815d7067cb14a154068847"

RPROVIDES:${PN} += "ghc-devel-haskell-lexer-1.1.1-C14Cmw3wUWQ88vb32sfZ2Z \
ghc-haskell-lexer-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-haskell-lexer"

inherit rpm
