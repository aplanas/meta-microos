SUMMARY = "Haskell persistent profiling library"
DESCRIPTION = "This package provides the Haskell persistent profiling library."
LICENSE = "MIT"

PV = "2.14.5.1"

RPM_NAME = "ghc-persistent-prof-2.14.5.1-1.9.aarch64.rpm"
RPM_HASH = "761336e93fbceb38ec297d8579cd5b2b46e3b99b23c9a8e85eb5e66adc7bfe9e55799576e2014319c12330942bb78b4e6b98392d03e7603b8272b6a768227ce2"

RPROVIDES:${PN} += "ghc-persistent-prof \
ghc-prof-persistent-2.14.5.1-Gjrp3WYLCFS91AokYH8j1m"

RDEPENDS:${PN} += "ghc-persistent-devel \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-base64-bytestring-1.2.1.0-JQ4JRrw3cTgQfbCEB1eM \
ghc-prof-blaze-html-0.9.1.2-5H8nSo5QBpfC5vHZY7C1Ii \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-fast-logger-3.1.2-2QS5oj3W57wGcX3QgTrERi \
ghc-prof-http-api-data-0.5-9CvKaE1JZO8KjKgwdog9dy \
ghc-prof-lift-type-0.1.1.1-4CMQtv7szwz8L9BvxxqTk1 \
ghc-prof-monad-logger-0.3.40-7M7roko8a7PJ68wJBTUT6s \
ghc-prof-mtl-2.2.2 \
ghc-prof-path-pieces-0.2.1-JEJ6IegDP1FHzqmKWi176n \
ghc-prof-resource-pool-0.4.0.0-7uUtnYEtaeP22tTkIEO3ty \
ghc-prof-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-prof-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-prof-silently-1.2.5.3-DooEMl8ysOU4ZpgKypCRy8 \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-th-lift-instances-0.1.20-BKODVtFlRayDjKs9vGaGq3 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unliftio-0.2.25.0-3qMuNOSHhnhIHN5x7dVwVu \
ghc-prof-unliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-prof-vault-0.3.1.5-JTstBlaocLP2eokwHW0Uig \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku"

inherit rpm
