SUMMARY = "Haskell haskell-lexer library development files"
DESCRIPTION = "This package provides the Haskell haskell-lexer library development files."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "ghc-haskell-lexer-devel-1.1.1-2.6.aarch64.rpm"
RPM_HASH = "22eb8be94f81e6a6c7cb379c92cc25cc2e16c24cf4ed3245fe9cf97999d86a4158ad2f2a9c1be1708e5a6200dddb7807bdeaf0a6eae3403e1076de9d0e66be59"

RPROVIDES:${PN} += "ghc-devel-haskell-lexer-1.1.1-FBBQnuYVuwZ6NRUVHfUjFR \
ghc-haskell-lexer-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-haskell-lexer"

inherit rpm
