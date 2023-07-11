SUMMARY = "Haskell utf8-string profiling library"
DESCRIPTION = "This package provides the Haskell utf8-string profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.2"

RPM_NAME = "ghc-utf8-string-prof-1.0.2-2.6.aarch64.rpm"
RPM_HASH = "6153f4350e99c9c2ae794196fe0a7a7bead1d5e701ee55ab51a9464a04bbbed62a215488c0092891ae82d4a7743c2f4b900c05249e46c40798ec33756686c045"

RPROVIDES:${PN} += "ghc-prof-utf8-string-1.0.2-3yyxPCwARUwDt9ZNWn320Q \
ghc-utf8-string-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-utf8-string-devel"

inherit rpm
