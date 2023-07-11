SUMMARY = "Haskell ghc-boot library development files"
DESCRIPTION = "This package provides the Haskell ghc-boot library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.5"

RPM_NAME = "ghc-ghc-boot-devel-9.4.5-3.2.aarch64.rpm"
RPM_HASH = "1c117056c006050b6f024508dfd070f681a70b53292ba38476c337122547cb10ae3930d07214344fb0bf62d0ceb30e9fe6bdd941c7604264454605257a0e5cad"

RPROVIDES:${PN} += "ghc-devel-ghc-boot-9.4.5 \
ghc-ghc-boot-devel \
ghc-ghc-boot-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-binary-0.8.9.1 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-ghc-boot-th-9.4.5 \
ghc-devel-unix-2.7.3 \
ghc-ghc-boot"

inherit rpm
