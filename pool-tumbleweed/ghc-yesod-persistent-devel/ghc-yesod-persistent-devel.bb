SUMMARY = "Haskell yesod-persistent library development files"
DESCRIPTION = "This package provides the Haskell yesod-persistent library development \
files."
LICENSE = "MIT"

PV = "1.6.0.8"

RPM_NAME = "ghc-yesod-persistent-devel-1.6.0.8-2.16.aarch64.rpm"
RPM_HASH = "8dcd85e05b7d792b41e3ea6a9d06f243f3f955a89b3c8a9d7c13f3a65c715ee4cc057562731b820f33270baf795a5a7aa7aa1656617eb9f68c403029857ee27c"

RPROVIDES:${PN} += "ghc-devel-yesod-persistent-1.6.0.8-93ozWuy4hEy3h1XQtLGAru \
ghc-yesod-persistent-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-blaze-builder-0.4.2.2-8UxXzIHQH0dLJoWXyTpU1h \
ghc-devel-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-devel-persistent-2.14.5.1-HbESoi5D00uF6Q9t3vbKri \
ghc-devel-resource-pool-0.4.0.0-7uUtnYEtaeP22tTkIEO3ty \
ghc-devel-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-yesod-core-1.6.24.4-cvcp8TZ1QYG0IH58f6f1F \
ghc-yesod-persistent"

inherit rpm
