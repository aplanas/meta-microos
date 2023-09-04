SUMMARY = "Haskell hslua-packaging library development files"
DESCRIPTION = "This package provides the Haskell hslua-packaging library development \
files."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-packaging-devel-2.3.0-1.8.aarch64.rpm"
RPM_HASH = "f2a5b5f3e6d47f2fe752e5e688e5be403300b93463da76e87466ade2fc73706b7732ff339549bb2a33ca6d1ffb474afbae11ec6d48ec31a76b39fe62b1b9565a"

RPROVIDES:${PN} += "ghc-devel-hslua-packaging-2.3.0-4zNLfL9evW33fw96RBrzdD \
ghc-hslua-packaging-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-devel-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-devel-hslua-objectorientation-2.3.0-26R83mqcSjNC8MxfPJWYVS \
ghc-devel-hslua-typing-0.1.0-3nJdpD9hvXQ79mUAqCbbUn \
ghc-devel-mtl-2.2.2 \
ghc-devel-text-2.0.2 \
ghc-hslua-packaging"

inherit rpm
