SUMMARY = "Haskell microlens-ghc library development files"
DESCRIPTION = "This package provides the Haskell microlens-ghc library development files."
LICENSE = "BSD-3-Clause"

PV = "0.4.14.1"

RPM_NAME = "ghc-microlens-ghc-devel-0.4.14.1-2.3.aarch64.rpm"
RPM_HASH = "37d22c397a627b63395c849eb0f94de66d34c57fb8657f9a5504d628fb5028caf926664e675ff9824a2c7fa65c76a32b9b20ba5d443d1b66cb14cf901d904946"

RPROVIDES:${PN} += "ghc-devel-microlens-ghc-0.4.14.1-JKvcbzfcB6d2jcW7Wili89 \
ghc-microlens-ghc-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-microlens-0.4.13.1-4XtL5z7DHHC7UZaR6xNDY3 \
ghc-devel-transformers-0.5.6.2 \
ghc-microlens-ghc"

inherit rpm
