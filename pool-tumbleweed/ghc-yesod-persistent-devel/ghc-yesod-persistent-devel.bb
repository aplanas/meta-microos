SUMMARY = "Haskell yesod-persistent library development files"
DESCRIPTION = "This package provides the Haskell yesod-persistent library development \
files."
LICENSE = "MIT"

PV = "1.6.0.8"

RPM_NAME = "ghc-yesod-persistent-devel-1.6.0.8-2.17.aarch64.rpm"
RPM_HASH = "38fc91a056dcba3e32f7418c6318823b69aa2687e70c12a9b2616e8385a4019799b38974c82066b25e61a10ab8a0c269d07ebda79d4dd556eaffa46c8907c907"

RPROVIDES:${PN} += "ghc-devel-yesod-persistent-1.6.0.8-2wkXYfzUlDeVV1OSzyB0l \
ghc-yesod-persistent-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-blaze-builder-0.4.2.3-5OTuTvWo4E897AhC0hKBND \
ghc-devel-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-devel-persistent-2.14.5.1-Gjrp3WYLCFS91AokYH8j1m \
ghc-devel-resource-pool-0.4.0.0-7uUtnYEtaeP22tTkIEO3ty \
ghc-devel-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-yesod-core-1.6.24.4-1di0EYNbRAz9TOkBiAT5Ab \
ghc-yesod-persistent"

inherit rpm
