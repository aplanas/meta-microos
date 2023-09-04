SUMMARY = "Haskell hslua-module-zip profiling library"
DESCRIPTION = "This package provides the Haskell hslua-module-zip profiling library."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-zip-prof-1.1.0-1.3.aarch64.rpm"
RPM_HASH = "fad41e9b47a5d4c671a51481d68ada57bbb44aaba67fd0e4ecb54c8b8a0630dbad83bc54b3ef8acf93a78fe788596b916747cb036916628875763932db872040"

RPROVIDES:${PN} += "ghc-hslua-module-zip-prof \
ghc-prof-hslua-module-zip-1.1.0-Fw4HFTouxng8yMIzubiVJd"

RDEPENDS:${PN} += "ghc-hslua-module-zip-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-prof-hslua-list-1.1.1-2YSx4pSaGRhHpPDWFYeDXu \
ghc-prof-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-prof-hslua-packaging-2.3.0-4zNLfL9evW33fw96RBrzdD \
ghc-prof-hslua-typing-0.1.0-3nJdpD9hvXQ79mUAqCbbUn \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2 \
ghc-prof-zip-archive-0.4.3-BovVKNnvnsMG9XB1oXeV8K"

inherit rpm
