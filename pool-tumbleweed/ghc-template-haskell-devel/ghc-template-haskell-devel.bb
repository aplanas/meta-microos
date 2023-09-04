SUMMARY = "Haskell template-haskell library development files"
DESCRIPTION = "This package provides the Haskell template-haskell library development files."
LICENSE = "BSD-3-Clause"

PV = "2.19.0.0"

RPM_NAME = "ghc-template-haskell-devel-2.19.0.0-1.1.aarch64.rpm"
RPM_HASH = "e9c03e24185d6e92d0f05d16698ef3dd2c81d130bcc83f727557fec8a33f2c38beaec4abf9b3260689e3939a9c714c15e2f0a1f12ff7248a9f837cb9ab14ae97"

RPROVIDES:${PN} += "ghc-devel-template-haskell-2.19.0.0 \
ghc-template-haskell-devel \
ghc-template-haskell-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-ghc-boot-th-9.4.6 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-pretty-1.1.3.6 \
ghc-template-haskell"

inherit rpm
