SUMMARY = "Haskell hslua-module-version profiling library"
DESCRIPTION = "This package provides the Haskell hslua-module-version profiling library."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-version-prof-1.1.0-1.3.aarch64.rpm"
RPM_HASH = "c54a439edaadaac64e8ca0446c09f5435d2dc55bb36f8c12babaeae5d55ef5a29e40fbb3c8ef998c20e2d300c6c21122fe79eae7b38f2a9b06e2a38b8016283c"

RPROVIDES:${PN} += "ghc-hslua-module-version-prof \
ghc-prof-hslua-module-version-1.1.0-C6IULHIw2X5B1pQoolTNUq"

RDEPENDS:${PN} += "ghc-hslua-module-version-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-prof-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-prof-hslua-packaging-2.3.0-4zNLfL9evW33fw96RBrzdD \
ghc-prof-text-2.0.2"

inherit rpm
