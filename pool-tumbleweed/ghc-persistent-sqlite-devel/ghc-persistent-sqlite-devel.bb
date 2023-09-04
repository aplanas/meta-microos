SUMMARY = "Haskell persistent-sqlite library development files"
DESCRIPTION = "This package provides the Haskell persistent-sqlite library development \
files."
LICENSE = "MIT"

PV = "2.13.1.1"

RPM_NAME = "ghc-persistent-sqlite-devel-2.13.1.1-2.14.aarch64.rpm"
RPM_HASH = "e9d2d4febc49be6718373155e566386a18f949242222fe81fe2cf03420cd4166573eb918bafd4cc5ab1107e665deeb2b27191dca99cc4bcc0c5dd106cd536d83"

RPROVIDES:${PN} += "ghc-devel-persistent-sqlite-2.13.1.1-DcSvQbIYTLYJkl0SJ6zlMb \
ghc-persistent-sqlite-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-devel-containers-0.6.7 \
ghc-devel-microlens-th-0.4.3.13-K3KDbjSa5xkBUVjBxtDTLF \
ghc-devel-monad-logger-0.3.40-7M7roko8a7PJ68wJBTUT6s \
ghc-devel-mtl-2.2.2 \
ghc-devel-persistent-2.14.5.1-HbESoi5D00uF6Q9t3vbKri \
ghc-devel-resource-pool-0.4.0.0-7uUtnYEtaeP22tTkIEO3ty \
ghc-devel-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-persistent-sqlite \
glibc-devel \
sqlite3-devel"

inherit rpm
