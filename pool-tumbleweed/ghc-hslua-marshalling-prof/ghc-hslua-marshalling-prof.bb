SUMMARY = "Haskell hslua-marshalling profiling library"
DESCRIPTION = "This package provides the Haskell hslua-marshalling profiling library."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-marshalling-prof-2.3.0-1.8.aarch64.rpm"
RPM_HASH = "110db28de61ee00989f0c7e17beb5256468984981adcbc2e984445ed9e57768823e76b257648629d6baee4ea131b60a2e80b3a87c448873574c6da4b42477054"

RPROVIDES:${PN} += "ghc-hslua-marshalling-prof \
ghc-prof-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj"

RDEPENDS:${PN} += "ghc-hslua-marshalling-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-prof-mtl-2.2.2 \
ghc-prof-text-2.0.2"

inherit rpm
