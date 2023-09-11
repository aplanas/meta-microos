SUMMARY = "Haskell persistent-sqlite library development files"
DESCRIPTION = "This package provides the Haskell persistent-sqlite library development \
files."
LICENSE = "MIT"

PV = "2.13.1.1"

RPM_NAME = "ghc-persistent-sqlite-devel-2.13.1.1-2.15.aarch64.rpm"
RPM_HASH = "115efc1f87518c9963bf9efe580f38cbc696896c5f014f407d7a306c55572470b7fd7ea03ea9cb44ba71a30c3b798a5c9abd9fbf3987824536f3109e9b692507"

RPROVIDES:${PN} += "ghc-devel-persistent-sqlite-2.13.1.1-LFBaiZpqiPx36cLUcGmy9U \
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
ghc-devel-persistent-2.14.5.1-Gjrp3WYLCFS91AokYH8j1m \
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
