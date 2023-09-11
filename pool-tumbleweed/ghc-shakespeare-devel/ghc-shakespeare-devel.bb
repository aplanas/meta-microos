SUMMARY = "Haskell shakespeare library development files"
DESCRIPTION = "This package provides the Haskell shakespeare library development files."
LICENSE = "MIT"

PV = "2.0.30"

RPM_NAME = "ghc-shakespeare-devel-2.0.30-2.11.aarch64.rpm"
RPM_HASH = "ca39c4f0d8852b896e44338f43bcd23fb2915fbbf08a3ce72fde7fc274fa0d4fef50b7dc1e12a24f63c067cc77951cd3d09ddce41b84cdd9221d452d2be55a3c"

RPROVIDES:${PN} += "ghc-devel-shakespeare-2.0.30-5XHeuGt8JLJENvL2Ahdhem \
ghc-shakespeare-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-base-4.17.2.0 \
ghc-devel-blaze-html-0.9.1.2-5H8nSo5QBpfC5vHZY7C1Ii \
ghc-devel-blaze-markup-0.8.2.8-BmGeri7A4mfLP1PbPCfNFP \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-file-embed-0.0.15.0-DAhwsrlSNND3ZIPejkHOUv \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-process-1.6.17.0 \
ghc-devel-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-th-lift-0.8.4-Hb96g2HGtQyHkKuMt8Wl3a \
ghc-devel-time-1.12.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-shakespeare"

inherit rpm
