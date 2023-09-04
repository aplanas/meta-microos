SUMMARY = "Haskell hslua profiling library"
DESCRIPTION = "This package provides the Haskell hslua profiling library."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-prof-2.3.0-1.6.aarch64.rpm"
RPM_HASH = "267cbb5879f441ce3b27aa9f84f4fd78674f1ae34eaf0eeaee568b5206dfe0486014105c786c7fa5c96a341cd20867f69d648d869aea3f1df31404b4edbcc6fd"

RPROVIDES:${PN} += "ghc-hslua-prof \
ghc-prof-hslua-2.3.0-IFweDrinoAduGRRaqkwGX"

RDEPENDS:${PN} += "ghc-hslua-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-hslua-aeson-2.3.0.1-GTKyJZd9E8T7sbi3aSnblh \
ghc-prof-hslua-classes-2.3.0-B1L4OZUPrf8GQ47NXlejyp \
ghc-prof-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-prof-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-prof-hslua-objectorientation-2.3.0-26R83mqcSjNC8MxfPJWYVS \
ghc-prof-hslua-packaging-2.3.0-4zNLfL9evW33fw96RBrzdD \
ghc-prof-hslua-typing-0.1.0-3nJdpD9hvXQ79mUAqCbbUn \
ghc-prof-mtl-2.2.2 \
ghc-prof-text-2.0.2"

inherit rpm
