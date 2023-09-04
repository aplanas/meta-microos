SUMMARY = "Haskell yaml library development files"
DESCRIPTION = "This package provides the Haskell yaml library development files."
LICENSE = "BSD-3-Clause"

PV = "0.11.11.2"

RPM_NAME = "ghc-yaml-devel-0.11.11.2-1.5.aarch64.rpm"
RPM_HASH = "0309bbd5b65a1d07852703bb275cdb506b14178a4ddfdd8f7532ee4fc68fc187edf3ac7c0962221e6bc08b8cb1448ad39d3e704cdd706de8b2b4ca68d560f7ad"

RPROVIDES:${PN} += "ghc-devel-yaml-0.11.11.2-A2RJT0EorR9GrZjUq6QELM \
ghc-yaml-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-conduit-1.3.5-3TRUhNB8WbY2vxuXe2VjBX \
ghc-devel-containers-0.6.7 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-libyaml-0.1.2-EDd2y61D5c93Khh6u4Ilj1 \
ghc-devel-mtl-2.2.2 \
ghc-devel-resourcet-1.2.6-AOipJdCu0ULL3KFWw8x9fP \
ghc-devel-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-yaml"

inherit rpm
