SUMMARY = "GHC development libraries meta package"
DESCRIPTION = "This is a meta-package for all the development library packages in GHC \
except the ghc library, which is installed by the toplevel ghc metapackage."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-devel-9.4.6-1.1.aarch64.rpm"
RPM_HASH = "f2ac3baedfedb7ac153b1d75cf2efa286b2f68613ea549ba4df3ae5c797b09841155c4fa1c26cc88a85e022451784ba96052359dce0a325c4a4878beeffd9637"

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
