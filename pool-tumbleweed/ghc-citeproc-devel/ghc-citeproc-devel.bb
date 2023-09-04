SUMMARY = "Haskell citeproc library development files"
DESCRIPTION = "This package provides the Haskell citeproc library development files."
LICENSE = "BSD-2-Clause"

PV = "0.8.1"

RPM_NAME = "ghc-citeproc-devel-0.8.1-2.14.aarch64.rpm"
RPM_HASH = "80b42e5ab83a0ad6a1e7c85be5ef495c6a6bc015edcfc3d17f5b8b24e25e937379ec97f3ff6f0c7c3a7b1dba1f0a77fdf624b01b6fbee152f6a767aa8f8d2b67"

RPROVIDES:${PN} += "ghc-citeproc-devel \
ghc-devel-citeproc-0.8.1-D6MAOBfduqd1r1TVF002aA"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-citeproc \
ghc-compiler \
ghc-devel-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-devel-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-devel-containers-0.6.7 \
ghc-devel-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-devel-file-embed-0.0.15.0-DAhwsrlSNND3ZIPejkHOUv \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-pandoc-types-1.23.1-8yEOjBSLsT62OPTXI0FZpc \
ghc-devel-safe-0.3.19-9uHvZjuyLiR13wOGSONZxX \
ghc-devel-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-devel-unicode-collation-0.1.3.4-DqHFcwJyC4MIpiT6hQTOCQ \
ghc-devel-uniplate-1.6.13-EEjCQACslljIQmS3K29CqX \
ghc-devel-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-devel-xml-conduit-1.9.1.3-DDoR4rlzTH6QSHmFsTVd9"

inherit rpm
