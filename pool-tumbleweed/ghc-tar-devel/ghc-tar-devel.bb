SUMMARY = "Haskell tar library development files"
DESCRIPTION = "This package provides the Haskell tar library development files."
LICENSE = "BSD-3-Clause"

PV = "0.5.1.1"

RPM_NAME = "ghc-tar-devel-0.5.1.1-11.8.aarch64.rpm"
RPM_HASH = "fcea754828f421d37f4043528077988976df046ef627dc87461da26f0268fd6dbb081f9b4a09a7dd326523dff799d40817e9dd4aedc4327bd2b3ea173e30d805"

RPROVIDES:${PN} += "ghc-devel-tar-0.5.1.1-BRnIdFAlm3x9T54VHtqjP6 \
ghc-tar-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-time-1.12.2 \
ghc-tar"

inherit rpm
