SUMMARY = "Haskell hslua library development files"
DESCRIPTION = "This package provides the Haskell hslua library development files."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-devel-2.3.0-1.6.aarch64.rpm"
RPM_HASH = "5598e67ecf5f27a32f89eeb6f84cd42c5d0856a3db43d3dcc741426936225a3f7c05c45da47907ccb20ad35bf60c7a53477bdd2255e18e3351a6163b6a6c12fe"

RPROVIDES:${PN} += "ghc-devel-hslua-2.3.0-IFweDrinoAduGRRaqkwGX \
ghc-hslua-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-containers-0.6.7 \
ghc-devel-exceptions-0.10.5 \
ghc-devel-hslua-aeson-2.3.0.1-GTKyJZd9E8T7sbi3aSnblh \
ghc-devel-hslua-classes-2.3.0-B1L4OZUPrf8GQ47NXlejyp \
ghc-devel-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-devel-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-devel-hslua-objectorientation-2.3.0-26R83mqcSjNC8MxfPJWYVS \
ghc-devel-hslua-packaging-2.3.0-4zNLfL9evW33fw96RBrzdD \
ghc-devel-hslua-typing-0.1.0-3nJdpD9hvXQ79mUAqCbbUn \
ghc-devel-mtl-2.2.2 \
ghc-devel-text-2.0.2 \
ghc-hslua"

inherit rpm
