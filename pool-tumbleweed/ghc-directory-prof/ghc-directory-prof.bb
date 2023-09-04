SUMMARY = "Haskell directory profiling library"
DESCRIPTION = "This package provides the Haskell directory profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.7.1"

RPM_NAME = "ghc-directory-prof-1.3.7.1-1.1.aarch64.rpm"
RPM_HASH = "7bcad98dda0bca65e3e35709547e604edb77a5ed3ab4fd6435298dc5b25865460be6d9a9f25e158a63b316799c2b4cbdb23b878aa62126dbf4461ce3225e1a56"

RPROVIDES:${PN} += "ghc-directory-prof \
ghc-prof-directory-1.3.7.1"

RDEPENDS:${PN} += "ghc-directory-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-time-1.12.2 \
ghc-prof-unix-2.7.3"

inherit rpm
