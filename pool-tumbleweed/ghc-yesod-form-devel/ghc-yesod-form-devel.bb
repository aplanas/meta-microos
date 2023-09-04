SUMMARY = "Haskell yesod-form library development files"
DESCRIPTION = "This package provides the Haskell yesod-form library development files."
LICENSE = "MIT"

PV = "1.7.4"

RPM_NAME = "ghc-yesod-form-devel-1.7.4-1.17.aarch64.rpm"
RPM_HASH = "b1b7be15e8c12edbcfa9e80ce81a6ca3b2ba7b890e266fd48807b8a6ed20483ff28f10eab6ed17a4f0eaec23213203932ed6eb7afa963d1623decd46697e69a8"

RPROVIDES:${PN} += "ghc-devel-yesod-form-1.7.4-DXz1LHmFAGTJSpYkY14WzB \
ghc-yesod-form-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-blaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h \
ghc-devel-blaze-html-0.9.1.2-7UiwTnqTAqaHumXjuOqwSX \
ghc-devel-blaze-markup-0.8.2.8-FMWPznpLq5tCe2Goi5eAy9 \
ghc-devel-byteable-0.1.1-D4ZAyAuZ5dZDp71hQtTs5r \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-devel-email-validate-2.3.2.19-qAeQdfI4jV1bzSPjytegN \
ghc-devel-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-devel-persistent-2.14.5.1-HbESoi5D00uF6Q9t3vbKri \
ghc-devel-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-devel-shakespeare-2.0.30-GrImIeltjQZ7T3c163uEiZ \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-devel-xss-sanitize-0.3.7.2-6wMPG57mjpfFkiVWmO24My \
ghc-devel-yesod-core-1.6.24.4-cvcp8TZ1QYG0IH58f6f1F \
ghc-devel-yesod-persistent-1.6.0.8-93ozWuy4hEy3h1XQtLGAru \
ghc-yesod-form"

inherit rpm
