SUMMARY = "Haskell citeproc profiling library"
DESCRIPTION = "This package provides the Haskell citeproc profiling library."
LICENSE = "BSD-2-Clause"

PV = "0.8.1"

RPM_NAME = "ghc-citeproc-prof-0.8.1-2.15.aarch64.rpm"
RPM_HASH = "806bf5a39f34f78f4ee3aa0307441bd84d018e8b7ee8e2a33852d778ee50ab7f3f54a1a389817f7fdc4b6dc75dc3e4b83405a7c1dcea0cefce6c7097df00aecb"

RPROVIDES:${PN} += "ghc-citeproc-prof \
ghc-prof-citeproc-0.8.1-2pX9OkWyX7lDXHT1UDpuWJ"

RDEPENDS:${PN} += "ghc-citeproc-devel \
ghc-prof-aeson-2.1.2.1-F1kFu5nx3L2A2kaYbyielc \
ghc-prof-attoparsec-0.14.4-54ZoOcYS6qmLoV5VBUocW3 \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-prof-file-embed-0.0.15.0-DAhwsrlSNND3ZIPejkHOUv \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-pandoc-types-1.23.1-8yEOjBSLsT62OPTXI0FZpc \
ghc-prof-safe-0.3.19-9uHvZjuyLiR13wOGSONZxX \
ghc-prof-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2 \
ghc-prof-unicode-collation-0.1.3.5-IFdGKnlU7nK53rXIDeXQnQ \
ghc-prof-uniplate-1.6.13-EEjCQACslljIQmS3K29CqX \
ghc-prof-vector-0.13.0.0-2UZsZW2LfoDoE4x89R5ku \
ghc-prof-xml-conduit-1.9.1.3-2cOMN3SNzhLD8DxEiNBrwq"

inherit rpm
