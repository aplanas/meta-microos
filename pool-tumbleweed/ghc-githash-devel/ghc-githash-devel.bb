SUMMARY = "Haskell githash library development files"
DESCRIPTION = "This package provides the Haskell githash library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.7.0"

RPM_NAME = "ghc-githash-devel-0.1.7.0-1.3.aarch64.rpm"
RPM_HASH = "9f2e29e4cb7a052110cca0b984e4d32cbe2d4d9973d60f5bd7a8b8b8578c46a13e976976d4ddc8c269a8027fc635105ad098a7a4aa05dd91d5b8557ec5d41c06"

RPROVIDES:${PN} += "ghc-devel-githash-0.1.7.0-99BBKgCWJJUA6aWVuD3QRz \
ghc-githash-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-process-1.6.16.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-th-compat-0.1.4-Bzk38miPOyTJh1KMkOoOkv \
ghc-githash"

inherit rpm
