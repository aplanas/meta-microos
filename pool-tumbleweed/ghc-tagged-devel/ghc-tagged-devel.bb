SUMMARY = "Haskell tagged library development files"
DESCRIPTION = "This package provides the Haskell tagged library development files."
LICENSE = "BSD-3-Clause"

PV = "0.8.8"

RPM_NAME = "ghc-tagged-devel-0.8.8-1.2.aarch64.rpm"
RPM_HASH = "b1c3324dc85c39c658ea8792263ebdcc265680a2a99102a87fde00681247e3cb1a422eff9a72e8e459b0f5177c3674e9cb4d15912d9cf182bd0159bc1d9bee96"

RPROVIDES:${PN} += "ghc-devel-tagged-0.8.8-F8tUU1VLXnpEnuQm0aKvax \
ghc-tagged-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-template-haskell-2.19.0.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-tagged"

inherit rpm
