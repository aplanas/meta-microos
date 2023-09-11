SUMMARY = "Haskell shakespeare profiling library"
DESCRIPTION = "This package provides the Haskell shakespeare profiling library."
LICENSE = "MIT"

PV = "2.0.30"

RPM_NAME = "ghc-shakespeare-prof-2.0.30-2.11.aarch64.rpm"
RPM_HASH = "a1e3572c573d9d021f6e767f373c6b8a15ad5ad684c14f64a6aed6491bd5adc6e17dafcccca21329af8ac96c524bbec00a7518c3b18c2008d0a84c4c9b17d925"

RPROVIDES:${PN} += "ghc-prof-shakespeare-2.0.30-5XHeuGt8JLJENvL2Ahdhem \
ghc-shakespeare-prof"

RDEPENDS:${PN} += "ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-base-4.17.2.0 \
ghc-prof-blaze-html-0.9.1.2-5H8nSo5QBpfC5vHZY7C1Ii \
ghc-prof-blaze-markup-0.8.2.8-BmGeri7A4mfLP1PbPCfNFP \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-file-embed-0.0.15.0-DAhwsrlSNND3ZIPejkHOUv \
ghc-prof-ghc-prim-0.9.1 \
ghc-prof-parsec-3.1.16.1 \
ghc-prof-process-1.6.17.0 \
ghc-prof-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-prof-template-haskell-2.19.0.0 \
ghc-prof-text-2.0.2 \
ghc-prof-th-lift-0.8.4-Hb96g2HGtQyHkKuMt8Wl3a \
ghc-prof-time-1.12.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-shakespeare-devel"

inherit rpm
