SUMMARY = "GHC development libraries meta package"
DESCRIPTION = "This is a meta-package for all the development library packages in GHC \
except the ghc library, which is installed by the toplevel ghc metapackage."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-devel-9.4.5-3.2.aarch64.rpm"
RPM_HASH = "278952617cc2d364bffc1f422958b45a2e89b9b4ab8fbd3920794f566018564f7924521d0daf4868128e37db3479d5c619df87a1cc1100a8f1c9866612bb664d"

RPROVIDES:${PN} += "ghc-devel \
ghc-libraries"

RDEPENDS:${PN} += "ghc-Cabal-devel \
ghc-Cabal-syntax-devel \
ghc-array-devel \
ghc-base-devel \
ghc-binary-devel \
ghc-bytestring-devel \
ghc-compiler \
ghc-containers-devel \
ghc-deepseq-devel \
ghc-directory-devel \
ghc-exceptions-devel \
ghc-filepath-devel \
ghc-ghc-boot-th-devel \
ghc-haskeline-devel \
ghc-mtl-devel \
ghc-parsec-devel \
ghc-pretty-devel \
ghc-process-devel \
ghc-stm-devel \
ghc-template-haskell-devel \
ghc-terminfo-devel \
ghc-text-devel \
ghc-time-devel \
ghc-transformers-devel \
ghc-unix-devel \
ghc-xhtml-devel"

inherit rpm
