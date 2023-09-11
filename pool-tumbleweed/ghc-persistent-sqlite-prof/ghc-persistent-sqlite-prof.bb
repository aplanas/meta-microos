SUMMARY = "Haskell persistent-sqlite profiling library"
DESCRIPTION = "This package provides the Haskell persistent-sqlite profiling library."
LICENSE = "MIT"

PV = "2.13.1.1"

RPM_NAME = "ghc-persistent-sqlite-prof-2.13.1.1-2.15.aarch64.rpm"
RPM_HASH = "deff2da5a62112503d6e617dac8339c20c2dbb9b80603717c0229310762ae7ad8f71858c26ce1e237606e4adb61376866e073b21c614bb10b3548851630bb770"

RPROVIDES:${PN} += "ghc-persistent-sqlite-prof \
ghc-prof-persistent-sqlite-2.13.1.1-LFBaiZpqiPx36cLUcGmy9U"

RDEPENDS:${PN} += "ghc-persistent-sqlite-devel \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-prof-containers-0.6.7 \
ghc-prof-microlens-th-0.4.3.13-K3KDbjSa5xkBUVjBxtDTLF \
ghc-prof-monad-logger-0.3.40-7M7roko8a7PJ68wJBTUT6s \
ghc-prof-mtl-2.2.2 \
ghc-prof-persistent-2.14.5.1-Gjrp3WYLCFS91AokYH8j1m \
ghc-prof-resource-pool-0.4.0.0-7uUtnYEtaeP22tTkIEO3ty \
ghc-prof-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unliftio-core-0.2.1.0-LP03A4AUPGIIJc7XWMX3ES \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn"

inherit rpm
