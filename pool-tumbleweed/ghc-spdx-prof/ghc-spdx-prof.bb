SUMMARY = "Haskell spdx profiling library"
DESCRIPTION = "This package provides the Haskell spdx profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.3"

RPM_NAME = "ghc-spdx-prof-1.0.0.3-1.3.aarch64.rpm"
RPM_HASH = "440e1f3c56e08d88efd762199300bbf10b4ef704c73056e18c4f4bbecc32092379dd54cf6b7ffd965241cb3933ce183c3645e907485aace0daf4dfd1650bfa74"

RPROVIDES:${PN} += "ghc-prof-spdx-1.0.0.3-4SEI6zaM8QU9eQO97OlzoR \
ghc-spdx-prof"

RDEPENDS:${PN} += "ghc-prof-Cabal-3.8.1.0 \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-transformers-0.5.6.2 \
ghc-spdx-devel"

inherit rpm
