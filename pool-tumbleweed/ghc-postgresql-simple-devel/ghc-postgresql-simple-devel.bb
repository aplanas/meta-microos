SUMMARY = "Haskell postgresql-simple library development files"
DESCRIPTION = "This package provides the Haskell postgresql-simple library development \
files."
LICENSE = "BSD-3-Clause"

PV = "0.6.5"

RPM_NAME = "ghc-postgresql-simple-devel-0.6.5-3.3.aarch64.rpm"
RPM_HASH = "6910061e03998a0c8c0b7ad41c2145c6bc5ff483cef54accff3d6121b7e5b1dd9b87fea251763f7ca7489ac0d6acb2d5a1e239bac8a00b3a9a9f680c43a0602d"

RPROVIDES:${PN} += "ghc-devel-postgresql-simple-0.6.5-4SdcA6z79O7Dp0GdOYFMox \
ghc-postgresql-simple-devel"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel-Only-0.1-ETd5YCT0TwGLbN8rgpgTS8 \
ghc-devel-aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP \
ghc-devel-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-devel-containers-0.6.7 \
ghc-devel-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-devel-postgresql-libpq-0.9.5.0-EniLDQI99PgI2VDyTYHGox \
ghc-devel-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-time-compat-1.9.6.1-2Pu0F2MmAuC1LEapOv1K82 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-uuid-types-1.0.5-LsoYQ81hhMAHUqibNrLXkM \
ghc-devel-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp \
ghc-postgresql-simple"

inherit rpm
