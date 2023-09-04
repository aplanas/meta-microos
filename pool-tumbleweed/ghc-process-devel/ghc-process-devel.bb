SUMMARY = "Haskell process library development files"
DESCRIPTION = "This package provides the Haskell process library development files."
LICENSE = "BSD-3-Clause"

PV = "1.6.17.0"

RPM_NAME = "ghc-process-devel-1.6.17.0-1.1.aarch64.rpm"
RPM_HASH = "88bd29e41f86fdb0a05b1b56a424cff0d99f94228af0ab2c068974a66d79138d5988103650992acfff38b6654ca9a148ec56ee2df10fb055ae0bcce7f1fb675f"

RPROVIDES:${PN} += "ghc-devel-process-1.6.17.0 \
ghc-process-devel \
ghc-process-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-unix-2.7.3 \
ghc-process"

inherit rpm
