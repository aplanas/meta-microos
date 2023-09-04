SUMMARY = "Haskell hslua-packaging profiling library"
DESCRIPTION = "This package provides the Haskell hslua-packaging profiling library."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-packaging-prof-2.3.0-1.8.aarch64.rpm"
RPM_HASH = "a8d9c5e0eeaf1c300ec7aa9a108db00f1c302787b92c8cfc2b65ebc8ad63dfc437ebc52d51645cb3cac4ea5463bb23eccf175daa08389b922eb80304e210aa45"

RPROVIDES:${PN} += "ghc-hslua-packaging-prof \
ghc-prof-hslua-packaging-2.3.0-4zNLfL9evW33fw96RBrzdD"

RDEPENDS:${PN} += "ghc-hslua-packaging-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-prof-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-prof-hslua-objectorientation-2.3.0-26R83mqcSjNC8MxfPJWYVS \
ghc-prof-hslua-typing-0.1.0-3nJdpD9hvXQ79mUAqCbbUn \
ghc-prof-mtl-2.2.2 \
ghc-prof-text-2.0.2"

inherit rpm
