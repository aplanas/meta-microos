SUMMARY = "Haskell indexed-traversable library development files"
DESCRIPTION = "This package provides the Haskell indexed-traversable library development \
files."
LICENSE = "BSD-2-Clause"

PV = "0.1.2.1"

RPM_NAME = "ghc-indexed-traversable-devel-0.1.2.1-1.2.aarch64.rpm"
RPM_HASH = "849479af722021f4e6e2f96dab47750f015433685615cb4544264c4c9a509747f3628b932a22e04055057e1d1b37643923f6e44aabcc10d903a4c21432414f3a"

RPROVIDES:${PN} += "ghc-devel(indexed-traversable-0.1.2.1-1XiSi5jKFt6BqKufaNXxBs) \
ghc-indexed-traversable-devel \
ghc-indexed-traversable-devel(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ghc-compiler \
ghc-devel(array-0.5.4.0) \
ghc-devel(base-4.17.1.0) \
ghc-devel(containers-0.6.7) \
ghc-devel(transformers-0.5.6.2) \
ghc-indexed-traversable"

inherit rpm
