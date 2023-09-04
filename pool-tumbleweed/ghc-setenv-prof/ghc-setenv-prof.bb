SUMMARY = "Haskell setenv profiling library"
DESCRIPTION = "This package provides the Haskell setenv profiling library."
LICENSE = "MIT"

PV = "0.1.1.3"

RPM_NAME = "ghc-setenv-prof-0.1.1.3-12.3.aarch64.rpm"
RPM_HASH = "c72dc29d73b1015799664a00bfe6da227d69cc3d37fe55ffb61114c67e529d1233070c21e341326eb8ee226e9d2fe9fb92649f668c42184aa5bdd01605e22c94"

RPROVIDES:${PN} += "ghc-prof-setenv-0.1.1.3-5X2tG8kGRXiEiTQvekWgx7 \
ghc-setenv-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.2.0 \
ghc-prof-unix-2.7.3 \
ghc-setenv-devel"

inherit rpm
