SUMMARY = "Haskell ghc-lib-parser library development files"
DESCRIPTION = "This package provides the Haskell ghc-lib-parser library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.6.20230808"

RPM_NAME = "ghc-ghc-lib-parser-devel-9.4.6.20230808-1.2.aarch64.rpm"
RPM_HASH = "bef95e45d74b9c809b0f7b84c551ead99dd29595d62685ea7f26b9a1da0b43ed46d7081fb638645faf3186b98c905da22e53354152a4fe2c93fc9356252d2fe8"

RPROVIDES:${PN} += "ghc-devel-ghc-lib-parser-9.4.6.20230808-BTkqGaXXohb8duAYJJlTmh \
ghc-ghc-lib-parser-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-pretty-1.1.3.6 \
ghc-devel-process-1.6.17.0 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unix-2.7.3 \
ghc-ghc-lib-parser"

inherit rpm
