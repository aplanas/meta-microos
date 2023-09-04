SUMMARY = "Haskell hslua-module-path profiling library"
DESCRIPTION = "This package provides the Haskell hslua-module-path profiling library."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-path-prof-1.1.0-1.3.aarch64.rpm"
RPM_HASH = "43cc34c021e858b540c72e99d0b0df24209f4b044e2c1a5002b721e01da62cd7c5a728ed5245d4c83bc68fb4850c8b4d4efe67162146d47f03c0999af69ea09a"

RPROVIDES:${PN} += "ghc-hslua-module-path-prof \
ghc-prof-hslua-module-path-1.1.0-3XIGPd4cIDuFY6K1e1WFz9"

RDEPENDS:${PN} += "ghc-hslua-module-path-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-prof-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-prof-hslua-packaging-2.3.0-4zNLfL9evW33fw96RBrzdD \
ghc-prof-text-2.0.2"

inherit rpm
