SUMMARY = "Haskell ed25519 library development files"
DESCRIPTION = "This package provides the Haskell ed25519 library development files."
LICENSE = "MIT"

PV = "0.0.5.0"

RPM_NAME = "ghc-ed25519-devel-0.0.5.0-16.3.aarch64.rpm"
RPM_HASH = "c64c57afe0b88d6ac9529c2322e7b5f1e2381b8e4576ad2756677364d31101588acf18ec4ae9781842558b5b43be167f0e04501921260e5d8fb9cf7201f6c477"

RPROVIDES:${PN} += "ghc-devel-ed25519-0.0.5.0-EkN6WeFwHLH4dNF4Xthto8 \
ghc-ed25519-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-ed25519"

inherit rpm
