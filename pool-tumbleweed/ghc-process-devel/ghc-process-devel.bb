SUMMARY = "Haskell process library development files"
DESCRIPTION = "This package provides the Haskell process library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.16.0"

RPM_NAME = "ghc-process-devel-1.6.16.0-3.1.aarch64.rpm"
RPM_HASH = "d61384b8e889c26838a71333bc522aff9bc301f7646afc01e4dc6432cec5bc33e66016afc82b18858b80421c8e79c6901bd6088bd8bf0cd25a0fdc54a4d777c4"

RPROVIDES:${PN} += "ghc-devel-process-1.6.16.0 \
ghc-process-devel \
ghc-process-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-unix-2.7.3 \
ghc-process"

inherit rpm
