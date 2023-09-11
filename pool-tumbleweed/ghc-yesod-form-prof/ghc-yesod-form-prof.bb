SUMMARY = "Haskell yesod-form profiling library"
DESCRIPTION = "This package provides the Haskell yesod-form profiling library."
LICENSE = "MIT"

PV = "1.7.4"

RPM_NAME = "ghc-yesod-form-prof-1.7.4-1.18.aarch64.rpm"
RPM_HASH = "9880043e34ecf1d102a6726767ec17b93a8964ff1d980682985b374a6b776209b87e9866baab53283dc940658cf41d68c0c00321d8acd751af7bc5b3370e0c67"

RPROVIDES:${PN} += "ghc-prof-yesod-form-1.7.4-9E5QlEFVjzzJ8x8HqN3QEY \
ghc-yesod-form-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-blaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND \
ghc-prof-blaze-html-0.9.1.2-5H8nSo5QBpfC5vHZY7C1Ii \
ghc-prof-blaze-markup-0.8.2.8-BmGeri7A4mfLP1PbPCfNFP \
ghc-prof-byteable-0.1.1-D4ZAyAuZ5dZDp71hQtTs5r \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-prof-email-validate-2.3.2.19-qAeQdfI4jV1bzSPjytegN \
ghc-prof-network-uri-2.6.4.2-3utC1p6H7mg92qIH44jQaM \
ghc-prof-persistent-2.14.5.1-Gjrp3WYLCFS91AokYH8j1m \
ghc-prof-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-prof-shakespeare-2.0.30-5XHeuGt8JLJENvL2Ahdhem \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-wai-3.2.3-JhFX1996sswH7nU4MZQSow \
ghc-prof-xss-sanitize-0.3.7.2-6wMPG57mjpfFkiVWmO24My \
ghc-prof-yesod-core-1.6.24.4-1di0EYNbRAz9TOkBiAT5Ab \
ghc-prof-yesod-persistent-1.6.0.8-2wkXYfzUlDeVV1OSzyB0l \
ghc-yesod-form-devel"

inherit rpm
