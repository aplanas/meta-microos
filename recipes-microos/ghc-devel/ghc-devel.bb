SUMMARY = "GHC development libraries meta package"
DESCRIPTION = "This is a meta-package for all the development library packages in GHC \
except the ghc library, which is installed by the toplevel ghc metapackage."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-devel-9.4.5-1.1.aarch64.rpm"
RPM_HASH = "1e6cd09c240013ba593a0fa796f9c04578c41d156060e5b06dd5009a2ff89c7a1ee5c2c4ab98a12bc6e0d19c972d039aeacc9bb05cd1ebbcfd344806e9de0e7a"

RPROVIDES:${PN} += "ghc-devel ghc-devel(aarch-64) ghc-libraries"
RDEPENDS:${PN} += "ghc-Cabal-devel ghc-Cabal-syntax-devel ghc-array-devel ghc-base-devel ghc-binary-devel ghc-bytestring-devel ghc-compiler ghc-containers-devel ghc-deepseq-devel ghc-directory-devel ghc-exceptions-devel ghc-filepath-devel ghc-ghc-boot-th-devel ghc-haskeline-devel ghc-mtl-devel ghc-parsec-devel ghc-pretty-devel ghc-process-devel ghc-stm-devel ghc-template-haskell-devel ghc-terminfo-devel ghc-text-devel ghc-time-devel ghc-transformers-devel ghc-unix-devel ghc-xhtml-devel"

inherit rpm
