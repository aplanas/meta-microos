SUMMARY = "Haskell hslua-module-zip library development files"
DESCRIPTION = "This package provides the Haskell hslua-module-zip library development \
files."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-zip-devel-1.1.0-1.3.aarch64.rpm"
RPM_HASH = "2ac8943a1d8aa6f24e2fb2959a45c5dcf429fcc0ef465808fd1e285a0c799792cfe323f908fc4b31a93e1d6775ca5afc9e44e1929593087eeb60799bcc157ba7"

RPROVIDES:${PN} += "ghc-devel-hslua-module-zip-1.1.0-Fw4HFTouxng8yMIzubiVJd \
ghc-hslua-module-zip-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-devel-hslua-list-1.1.1-2YSx4pSaGRhHpPDWFYeDXu \
ghc-devel-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-devel-hslua-packaging-2.3.0-4zNLfL9evW33fw96RBrzdD \
ghc-devel-hslua-typing-0.1.0-3nJdpD9hvXQ79mUAqCbbUn \
ghc-devel-text-2.0.2 \
ghc-devel-time-1.12.2 \
ghc-devel-zip-archive-0.4.3-BovVKNnvnsMG9XB1oXeV8K \
ghc-hslua-module-zip"

inherit rpm
