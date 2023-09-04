SUMMARY = "Haskell directory library development files"
DESCRIPTION = "This package provides the Haskell directory library development files."
LICENSE = "BSD-3-Clause"

PV = "1.3.7.1"

RPM_NAME = "ghc-directory-devel-1.3.7.1-1.1.aarch64.rpm"
RPM_HASH = "e7ed4eea1eeb3c7bfba08994ca04e43d4c9eee0de7d814cd51c00be33b732bfd4c77bb1a5ce7f3b1671d0b7dc1b729fe4eae33a7265ea332000e30e531898567"

RPROVIDES:${PN} += "ghc-devel-directory-1.3.7.1 \
ghc-directory-devel \
ghc-directory-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-time-1.12.2 \
ghc-devel-unix-2.7.3 \
ghc-directory"

inherit rpm
