SUMMARY = "Haskell hslua-typing profiling library"
DESCRIPTION = "This package provides the Haskell hslua-typing profiling library."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "ghc-hslua-typing-prof-0.1.0-1.3.aarch64.rpm"
RPM_HASH = "971fb28cc593dbe8b1665854fce06d04d9dce91fe13e7fd5870d62aa572c5553fd3e7027e6b688e3a5b8b65c3f9049129bbb4b585d37eed8a771ec27f9157d1a"

RPROVIDES:${PN} += "ghc-hslua-typing-prof \
ghc-prof-hslua-typing-0.1.0-3nJdpD9hvXQ79mUAqCbbUn"

RDEPENDS:${PN} += "ghc-hslua-typing-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-prof-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-prof-text-2.0.2"

inherit rpm
