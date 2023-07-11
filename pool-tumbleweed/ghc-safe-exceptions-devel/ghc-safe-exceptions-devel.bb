SUMMARY = "Haskell safe-exceptions library development files"
DESCRIPTION = "This package provides the Haskell safe-exceptions library development \
files."
LICENSE = "MIT"

PV = "0.1.7.4"

RPM_NAME = "ghc-safe-exceptions-devel-0.1.7.4-1.1.aarch64.rpm"
RPM_HASH = "fc0c36c4cdc3fea74038eb9ec545e152dd58b565fcb4804cbca7a5ede1b816c8b82da677616b379f0fce3296fcfca834d5a4d3bcb52bd039306fbaba522e40cc"

RPROVIDES:${PN} += "ghc-devel-safe-exceptions-0.1.7.4-8XVKrMBchTjCLhdcvBwBNb \
ghc-safe-exceptions-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-transformers-0.5.6.2 \
ghc-safe-exceptions"

inherit rpm
