SUMMARY = "Haskell comonad library development files"
DESCRIPTION = "This package provides the Haskell comonad library development files."
LICENSE = "BSD-2-Clause"

PV = "5.0.8"

RPM_NAME = "ghc-comonad-devel-5.0.8-3.3.aarch64.rpm"
RPM_HASH = "7015fee083d74cab5f54a526230d54c341783e2e9dee7a16e9ec3a38456d13b503eda804f08fa583f69e636f58c19bc9e35e8f1d5aa2df7a94673d8ff60da386"

RPROVIDES:${PN} += "ghc-comonad-devel ghc-comonad-devel(aarch-64) ghc-devel(comonad-5.0.8-9UnH7KDg5138z3eBCPM7y4)"
RDEPENDS:${PN} += "/bin/sh ghc-comonad ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(containers-0.6.7) ghc-devel(distributive-0.6.2.1-GisXwtVaDTaDcC79Nunm79) ghc-devel(indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs) ghc-devel(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa) ghc-devel(transformers-0.5.6.2) ghc-devel(transformers-compat-0.7.2-7jAnhjvxTABIymoNGHTOwd)"

inherit rpm
