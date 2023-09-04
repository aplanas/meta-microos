SUMMARY = "Haskell spdx library development files"
DESCRIPTION = "This package provides the Haskell spdx library development files."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.3"

RPM_NAME = "ghc-spdx-devel-1.0.0.3-1.3.aarch64.rpm"
RPM_HASH = "324f3cd095fef82d9418f3d976f80f5c99ab5c76cf1cb944b7a0b1da8c9ce7b0056871f2b6745a38e931c9e91dda8f6e1e351d4ad1fdc8dd1cd7b0d199906480"

RPROVIDES:${PN} += "ghc-devel-spdx-1.0.0.3-4SEI6zaM8QU9eQO97OlzoR \
ghc-spdx-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-Cabal-3.8.1.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-transformers-0.5.6.2 \
ghc-spdx"

inherit rpm
