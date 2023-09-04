SUMMARY = "Haskell yesod-persistent profiling library"
DESCRIPTION = "This package provides the Haskell yesod-persistent profiling library."
LICENSE = "MIT"

PV = "1.6.0.8"

RPM_NAME = "ghc-yesod-persistent-prof-1.6.0.8-2.16.aarch64.rpm"
RPM_HASH = "0bc65d69dfa14bb79af72599d56f767fb98c102f296ea1ed16b4775e81527031d15501e78bc84b5824206f3cfd88776cb5c3a02314282b086ad439e1a6b65dbd"

RPROVIDES:${PN} += "ghc-prof-yesod-persistent-1.6.0.8-93ozWuy4hEy3h1XQtLGAru \
ghc-yesod-persistent-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-blaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h \
ghc-prof-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-prof-persistent-2.14.5.1-HbESoi5D00uF6Q9t3vbKri \
ghc-prof-resource-pool-0.4.0.0-7uUtnYEtaeP22tTkIEO3ty \
ghc-prof-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-yesod-core-1.6.24.4-cvcp8TZ1QYG0IH58f6f1F \
ghc-yesod-persistent-devel"

inherit rpm
