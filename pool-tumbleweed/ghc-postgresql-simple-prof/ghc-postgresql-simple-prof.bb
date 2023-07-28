SUMMARY = "Haskell postgresql-simple profiling library"
DESCRIPTION = "This package provides the Haskell postgresql-simple profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6.5.1"

RPM_NAME = "ghc-postgresql-simple-prof-0.6.5.1-1.1.aarch64.rpm"
RPM_HASH = "814f4699b6fdd875d7777d236967f873543aade6fd19b6e4af3785a8fe101052ba2478fbea3468cb4c84702c5d26cbc97e70d41f40148fb38ed56eca5095a9ad"

RPROVIDES:${PN} += "ghc-postgresql-simple-prof \
ghc-prof-postgresql-simple-0.6.5.1-1Mr3UW7Sqm2LauK5jyfZE3"

RDEPENDS:${PN} += "ghc-postgresql-simple-devel \
ghc-prof-Only-0.1-ETd5YCT0TwGLbN8rgpgTS8 \
ghc-prof-aeson-2.1.2.1-HkN6OtqTngQ9De3CKBnfov \
ghc-prof-attoparsec-0.14.4-21v4nlnPs0qLZ5R1FIK9u3 \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-case-insensitive-1.2.1.0-AumZoR4Lds63HJj8OQwHY3 \
ghc-prof-containers-0.6.7 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-postgresql-libpq-0.9.5.0-EniLDQI99PgI2VDyTYHGox \
ghc-prof-scientific-0.3.7.0-D5F2vql7x79Dy9hx72OES1 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-time-compat-1.9.6.1-2Pu0F2MmAuC1LEapOv1K82 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-uuid-types-1.0.5-LsoYQ81hhMAHUqibNrLXkM \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
