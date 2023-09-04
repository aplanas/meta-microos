SUMMARY = "Haskell persistent library development files"
DESCRIPTION = "This package provides the Haskell persistent library development files."
LICENSE = "MIT"

PV = "2.14.5.1"

RPM_NAME = "ghc-persistent-devel-2.14.5.1-1.8.aarch64.rpm"
RPM_HASH = "ea43df4b471e70b80465e0a9950ad0eea4ef57d1fcc52e2899ef497e0facfbdb1af6baa895b29bd75a784782c100f76a2e61d29e92b981452d65d722f6007fd6"

RPROVIDES:${PN} += "ghc-devel-persistent-2.14.5.1-HbESoi5D00uF6Q9t3vbKri \
ghc-persistent-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-base64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM \
ghc-devel-blaze-html-0.9.1.2-7UiwTnqTAqaHumXjuOqwSX \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-fast-logger-3.1.2-2QS5oj3W57wGcX3QgTrERi \
ghc-devel-http-api-data-0.5-9CvKaE1JZO8KjKgwdog9dy \
ghc-devel-lift-type-0.1.1.1-4CMQtv7szwz8L9BvxxqTk1 \
ghc-devel-monad-logger-0.3.40-7M7roko8a7PJ68wJBTUT6s \
ghc-devel-mtl-2.2.2 \
ghc-devel-path-pieces-0.2.1-JEJ6IegDP1FHzqmKWi176n \
ghc-devel-resource-pool-0.4.0.0-7uUtnYEtaeP22tTkIEO3ty \
ghc-devel-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-devel-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-devel-silently-1.2.5.3-DooEMl8ysOU4ZpgKypCRy8 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-th-lift-instances-0.1.20-BKODVtFlRayDjKs9vGaGq3 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unliftio-0.2.25.0-3qMuNOSHhnhIHN5x7dVwVu \
ghc-devel-unliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-vault-0.3.1.5-JTstBlaocLP2eokwHW0Uig \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-persistent"

inherit rpm
