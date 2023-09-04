SUMMARY = "Haskell hslua-module-text profiling library"
DESCRIPTION = "This package provides the Haskell hslua-module-text profiling library."
LICENSE = "MIT"

PV = "1.1.0.1"

RPM_NAME = "ghc-hslua-module-text-prof-1.1.0.1-1.3.aarch64.rpm"
RPM_HASH = "7561351870313223994e2c0712109368cd246909cdadcfeeec458b5f74635384be975d6a866ba47cbf3a3d0c271fbcc56faa2ec882a1e147ce1c476846167b6f"

RPROVIDES:${PN} += "ghc-hslua-module-text-prof \
ghc-prof-hslua-module-text-1.1.0.1-3IzHe65h4nzA5y3IIyP0nc"

RDEPENDS:${PN} += "ghc-hslua-module-text-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-prof-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-prof-hslua-packaging-2.3.0-4zNLfL9evW33fw96RBrzdD \
ghc-prof-text-2.0.2"

inherit rpm
