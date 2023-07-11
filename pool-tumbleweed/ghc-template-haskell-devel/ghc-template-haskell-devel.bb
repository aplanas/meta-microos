SUMMARY = "Haskell template-haskell library development files"
DESCRIPTION = "This package provides the Haskell template-haskell library development files."
LICENSE = "BSD-3-Clause"

PV = "2.19.0.0"

RPM_NAME = "ghc-template-haskell-devel-2.19.0.0-3.2.aarch64.rpm"
RPM_HASH = "50513c78a48576a7d9a9619138b03c513c661487ab2e38e51c82445a4a883c89281fb4f2b4e04a959996fbb263a03b562aa4982f4c9878b00e6c34e81e71b339"

RPROVIDES:${PN} += "ghc-devel-template-haskell-2.19.0.0 \
ghc-template-haskell-devel \
ghc-template-haskell-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-ghc-boot-th-9.4.5 \
ghc-devel-ghc-prim-0.9.0 \
ghc-devel-pretty-1.1.3.6 \
ghc-template-haskell"

inherit rpm
