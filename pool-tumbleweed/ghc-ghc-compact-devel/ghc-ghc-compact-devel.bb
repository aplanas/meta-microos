SUMMARY = "Haskell ghc-compact library development files"
DESCRIPTION = "This package provides the Haskell ghc-compact library development files."
LICENSE = "BSD-3-Clause"

PV = "0.1.0.0"

RPM_NAME = "ghc-ghc-compact-devel-0.1.0.0-3.2.aarch64.rpm"
RPM_HASH = "0149dd2525ea6f30e97dfc68351b5ba3c31fa7bad946784abbc8bdb03d73eec855d91902231d4522d2265303519fea05dae359523599f9b6997d5a388eb969c3"

RPROVIDES:${PN} += "ghc-devel-ghc-compact-0.1.0.0 \
ghc-ghc-compact-devel \
ghc-ghc-compact-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-bytestring-0.11.4.0 \
ghc-devel-ghc-prim-0.9.0 \
ghc-ghc-compact"

inherit rpm
