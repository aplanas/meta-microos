SUMMARY = "Haskell megaparsec library development files"
DESCRIPTION = "This package provides the Haskell megaparsec library development files."
LICENSE = "BSD-2-Clause"

PV = "9.3.1"

RPM_NAME = "ghc-megaparsec-devel-9.3.1-1.6.aarch64.rpm"
RPM_HASH = "dcbe7b3560b04d47465b69ff590f39765d5ef653f823f4a251ff1f734afb52a85d0fd7fad60dea90bbde426fbecc9b59a96e90f52f6d825e38fcb54728b07909"

RPROVIDES:${PN} += "ghc-devel-megaparsec-9.3.1-Jdwz39dpTDz8anub3eLd49 \
ghc-megaparsec-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-mtl-2.2.2 \
ghc-devel-parser-combinators-1.3.0-9EAIYkVxwfT3bR6YOGtMtZ \
ghc-devel-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-devel-text-2.0.2 \
ghc-devel-transformers-0.5.6.2 \
ghc-megaparsec"

inherit rpm
