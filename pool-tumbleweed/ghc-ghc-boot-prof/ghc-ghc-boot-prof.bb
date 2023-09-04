SUMMARY = "Haskell ghc-boot profiling library"
DESCRIPTION = "This package provides the Haskell ghc-boot profiling library."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-ghc-boot-prof-9.4.6-1.1.aarch64.rpm"
RPM_HASH = "6d583a37aaf941987cb9286407be58f1e68b3c7a7bc49caa35780da39f09003214bee322d0beffb175de447a053c53fad3397c191f1cd09d5fcac705c4296883"

RPROVIDES:${PN} += "ghc-ghc-boot-prof \
ghc-prof-ghc-boot-9.4.6"

RDEPENDS:${PN} += "ghc-ghc-boot-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-ghc-boot-th-9.4.6 \
ghc-prof-unix-2.7.3"

inherit rpm
