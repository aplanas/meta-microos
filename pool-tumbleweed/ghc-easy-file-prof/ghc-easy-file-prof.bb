SUMMARY = "Haskell easy-file profiling library"
DESCRIPTION = "This package provides the Haskell easy-file profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.5"

RPM_NAME = "ghc-easy-file-prof-0.2.5-1.3.aarch64.rpm"
RPM_HASH = "b2b2fca0d477dcea651beee11c4f20b0ae5559c8c32117d787610230fd1f4102afc7e1071f2321f58ded61e1d7865e90560c7cd89a9c5391eeb20d811684ee16"

RPROVIDES:${PN} += "ghc-easy-file-prof \
ghc-prof-easy-file-0.2.5-Eune3nGPx4BABAmiN3TyxF"

RDEPENDS:${PN} += "ghc-easy-file-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-time-1.12.2 \
ghc-prof-unix-2.7.3"

inherit rpm
