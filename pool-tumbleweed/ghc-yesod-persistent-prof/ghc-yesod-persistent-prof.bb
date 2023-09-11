SUMMARY = "Haskell yesod-persistent profiling library"
DESCRIPTION = "This package provides the Haskell yesod-persistent profiling library."
LICENSE = "MIT"

PV = "1.6.0.8"

RPM_NAME = "ghc-yesod-persistent-prof-1.6.0.8-2.17.aarch64.rpm"
RPM_HASH = "b455432740c09ec6b2bff74d5b8f2e6995f995974c252c6276af59bb460a87d3831972464c1c2c6f7b81da7cbf405af0f1ebe76101dfbc11f7f1cda60d8a3fc7"

RPROVIDES:${PN} += "ghc-prof-yesod-persistent-1.6.0.8-2wkXYfzUlDeVV1OSzyB0l \
ghc-yesod-persistent-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-blaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND \
ghc-prof-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-prof-persistent-2.14.5.1-Gjrp3WYLCFS91AokYH8j1m \
ghc-prof-resource-pool-0.4.0.0-7uUtnYEtaeP22tTkIEO3ty \
ghc-prof-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-yesod-core-1.6.24.4-1di0EYNbRAz9TOkBiAT5Ab \
ghc-yesod-persistent-devel"

inherit rpm
