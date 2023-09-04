SUMMARY = "Haskell hslua-objectorientation profiling library"
DESCRIPTION = "This package provides the Haskell hslua-objectorientation profiling library."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-objectorientation-prof-2.3.0-1.4.aarch64.rpm"
RPM_HASH = "f324035d7a2209777584ed65d5a0c780b56caeeecbb6c867f29ab63eedb1fe2ed011278d19ab9de11377c1d525e35b9ec0943e0a556b6e63d8cf4d6a1a29c6f9"

RPROVIDES:${PN} += "ghc-hslua-objectorientation-prof \
ghc-prof-hslua-objectorientation-2.3.0-26R83mqcSjNC8MxfPJWYVS"

RDEPENDS:${PN} += "ghc-hslua-objectorientation-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-exceptions-0.10.5 \
ghc-prof-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-prof-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-prof-hslua-typing-0.1.0-3nJdpD9hvXQ79mUAqCbbUn \
ghc-prof-mtl-2.2.2 \
ghc-prof-text-2.0.2"

inherit rpm
