SUMMARY = "Haskell parser-combinators library development files"
DESCRIPTION = "This package provides the Haskell parser-combinators library development \
files."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "ghc-parser-combinators-devel-1.3.0-2.8.aarch64.rpm"
RPM_HASH = "55d8ea7af4e8e122275fcbf21c78fbad8a082b97e60d4cb98b43b89c0cc3e73e64bc1e4215130382d0b0b3a0e279529f6c3980b3a9a7ef7fc6197afe13c5d972"

RPROVIDES:${PN} += "ghc-devel-parser-combinators-1.3.0-9EAIYkVxwfT3bR6YOGtMtZ \
ghc-parser-combinators-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-parser-combinators"

inherit rpm
