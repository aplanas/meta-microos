SUMMARY = "Haskell megaparsec profiling library"
DESCRIPTION = "This package provides the Haskell megaparsec profiling library."
LICENSE = "BSD-2-Clause"

PV = "9.3.1"

RPM_NAME = "ghc-megaparsec-prof-9.3.1-1.6.aarch64.rpm"
RPM_HASH = "e23faacc5ec3e68e5692ce1f61fe9170034fcd640974e09f34bb7291766f8355fa3d74b4e8abfc36f12e1e8174e97d1a5a9dcd14150f8b25e9820e4fe6bc19e4"

RPROVIDES:${PN} += "ghc-megaparsec-prof \
ghc-prof-megaparsec-9.3.1-Jdwz39dpTDz8anub3eLd49"

RDEPENDS:${PN} += "ghc-megaparsec-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-case-insensitive-1.2.1.0-1a748JZqftHHwwFVz8QP9 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-mtl-2.2.2 \
ghc-prof-parser-combinators-1.3.0-9EAIYkVxwfT3bR6YOGtMtZ \
ghc-prof-scientific-0.3.7.0-2FbzCTQ2hp2GeCo5OsVSzz \
ghc-prof-text-2.0.2 \
ghc-prof-transformers-0.5.6.2"

inherit rpm
