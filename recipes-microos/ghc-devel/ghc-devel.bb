SUMMARY = "GHC development libraries meta package"
DESCRIPTION = "This is a meta-package for all the development library packages in GHC \
except the ghc library, which is installed by the toplevel ghc metapackage."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-devel-9.4.5-3.1.aarch64.rpm"
RPM_HASH = "feb8346c18b6cfacda69ffef4f304663fed099b5d38a1d5d39810618ec2337f16dfab683c6bde07a2f46b16622606494a395393f5d853e2d3c29cad544eb2585"

RPROVIDES:${PN} += "ghc-devel ghc-devel(aarch-64) ghc-libraries"
RDEPENDS:${PN} += "ghc-Cabal-devel ghc-Cabal-syntax-devel ghc-array-devel ghc-base-devel ghc-binary-devel ghc-bytestring-devel ghc-compiler ghc-containers-devel ghc-deepseq-devel ghc-directory-devel ghc-exceptions-devel ghc-filepath-devel ghc-ghc-boot-th-devel ghc-haskeline-devel ghc-mtl-devel ghc-parsec-devel ghc-pretty-devel ghc-process-devel ghc-stm-devel ghc-template-haskell-devel ghc-terminfo-devel ghc-text-devel ghc-time-devel ghc-transformers-devel ghc-unix-devel ghc-xhtml-devel"

inherit rpm
