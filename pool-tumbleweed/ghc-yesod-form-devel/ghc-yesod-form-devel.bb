SUMMARY = "Haskell yesod-form library development files"
DESCRIPTION = "This package provides the Haskell yesod-form library development files."
LICENSE = "MIT"

PV = "1.7.4"

RPM_NAME = "ghc-yesod-form-devel-1.7.4-1.18.aarch64.rpm"
RPM_HASH = "d3291a70837321da0b755e9b7b0cc58facce384f2a8c6a197b76ae8f5b4f5a13699b54141ae41d4ed27096206fc4314d36b372bc25503faa79d94bd57e5fc98d"

RPROVIDES:${PN} += "ghc-devel-yesod-form-1.7.4-9E5QlEFVjzzJ8x8HqN3QEY \
ghc-yesod-form-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-blaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND \
ghc-devel-blaze-html-0.9.1.2-5H8nSo5QBpfC5vHZY7C1Ii \
ghc-devel-blaze-markup-0.8.2.8-BmGeri7A4mfLP1PbPCfNFP \
ghc-devel-byteable-0.1.1-D4ZAyAuZ5dZDp71hQtTs5r \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-devel-email-validate-2.3.2.19-qAeQdfI4jV1bzSPjytegN \
ghc-devel-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-devel-persistent-2.14.5.1-Gjrp3WYLCFS91AokYH8j1m \
ghc-devel-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-devel-shakespeare-2.0.30-5XHeuGt8JLJENvL2Ahdhem \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-devel-xss-sanitize-0.3.7.2-6wMPG57mjpfFkiVWmO24My \
ghc-devel-yesod-core-1.6.24.4-1di0EYNbRAz9TOkBiAT5Ab \
ghc-devel-yesod-persistent-1.6.0.8-2wkXYfzUlDeVV1OSzyB0l \
ghc-yesod-form"

inherit rpm
