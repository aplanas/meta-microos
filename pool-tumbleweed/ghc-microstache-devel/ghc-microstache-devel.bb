SUMMARY = "Haskell microstache library development files"
DESCRIPTION = "This package provides the Haskell microstache library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.2.3"

RPM_NAME = "ghc-microstache-devel-1.0.2.3-3.5.aarch64.rpm"
RPM_HASH = "bb16966969a5f9765fa52d5088d6f28caddccfb283350b05de14b8e57e8ae45932fdd5bd642c18f6a0d64687567a30a9d88ff8e143e9cefcd3d75700646ed1a2"

RPROVIDES:${PN} += "ghc-devel-microstache-1.0.2.3-KBculmnRicB9ztvZCFpDOs \
ghc-microstache-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-parsec-3.1.16.1 \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unordered-containers-0.2.19.1-BD6cH0OVlFU7YsFVVfZeZn \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-microstache"

inherit rpm
