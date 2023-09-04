SUMMARY = "Haskell yesod-form profiling library"
DESCRIPTION = "This package provides the Haskell yesod-form profiling library."
LICENSE = "MIT"

PV = "1.7.4"

RPM_NAME = "ghc-yesod-form-prof-1.7.4-1.17.aarch64.rpm"
RPM_HASH = "6ec797e37af6527b7b7f988aa576421ea32cc83a7dbc02a9500013fb3b10a593af3aee0b820b1669ca51f08b446dc306ababc04f5ef46468022f1a2ffb469b2c"

RPROVIDES:${PN} += "ghc-prof-yesod-form-1.7.4-DXz1LHmFAGTJSpYkY14WzB \
ghc-yesod-form-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-blaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h \
ghc-prof-blaze-html-0.9.1.2-7UiwTnqTAqaHumXjuOqwSX \
ghc-prof-blaze-markup-0.8.2.8-FMWPznpLq5tCe2Goi5eAy9 \
ghc-prof-byteable-0.1.1-D4ZAyAuZ5dZDp71hQtTs5r \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-prof-email-validate-2.3.2.19-qAeQdfI4jV1bzSPjytegN \
ghc-prof-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-prof-persistent-2.14.5.1-HbESoi5D00uF6Q9t3vbKri \
ghc-prof-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-prof-shakespeare-2.0.30-GrImIeltjQZ7T3c163uEiZ \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-prof-xss-sanitize-0.3.7.2-6wMPG57mjpfFkiVWmO24My \
ghc-prof-yesod-core-1.6.24.4-cvcp8TZ1QYG0IH58f6f1F \
ghc-prof-yesod-persistent-1.6.0.8-93ozWuy4hEy3h1XQtLGAru \
ghc-yesod-form-devel"

inherit rpm
