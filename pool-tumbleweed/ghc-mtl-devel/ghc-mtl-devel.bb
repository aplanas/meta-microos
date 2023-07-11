SUMMARY = "Haskell mtl library development files"
DESCRIPTION = "This package provides the Haskell mtl library development files."
LICENSE = "BSD-3-Clause"

PV = "2.2.2"

RPM_NAME = "ghc-mtl-devel-2.2.2-3.2.aarch64.rpm"
RPM_HASH = "4950462934df0512ff79e7c031dfdb7f96dba270928eacc2c52375473245a7c5d30d4563abf9544ca33eb675b3e739b18835370a1e5239704872fd2ccc2301a6"

RPROVIDES:${PN} += "ghc-devel-mtl-2.2.2 \
ghc-mtl-devel \
ghc-mtl-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-transformers-0.5.6.2 \
ghc-mtl"

inherit rpm
