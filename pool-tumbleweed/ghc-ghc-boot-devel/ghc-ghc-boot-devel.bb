SUMMARY = "Haskell ghc-boot library development files"
DESCRIPTION = "This package provides the Haskell ghc-boot library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-ghc-boot-devel-9.4.6-1.1.aarch64.rpm"
RPM_HASH = "2f1e054fa74e7083fc1358e21a4bb82f8740d50fea4ea8f542ff8b814dad9137961dc77d8b01188837350bcf1d7f3ea3a7f2487bac4f9bcc1750ed299d679e1c"

RPROVIDES:${PN} += "ghc-devel-ghc-boot-9.4.6 \
ghc-ghc-boot-devel \
ghc-ghc-boot-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-ghc-boot-th-9.4.6 \
ghc-devel-unix-2.7.3 \
ghc-ghc-boot"

inherit rpm
