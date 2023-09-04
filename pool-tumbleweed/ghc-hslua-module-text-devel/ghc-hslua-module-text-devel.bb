SUMMARY = "Haskell hslua-module-text library development files"
DESCRIPTION = "This package provides the Haskell hslua-module-text library development \
files."
LICENSE = "MIT"

PV = "1.1.0.1"

RPM_NAME = "ghc-hslua-module-text-devel-1.1.0.1-1.3.aarch64.rpm"
RPM_HASH = "1bf05dca6fd5a06c95db578b8c3e27cbc654ce861d65e74bdf3070f7ab77c1e9ab79292092b04e12bf275dfe4dc47ca2dfd185686a38ece9a28f7d3f93edb862"

RPROVIDES:${PN} += "ghc-devel-hslua-module-text-1.1.0.1-3IzHe65h4nzA5y3IIyP0nc \
ghc-hslua-module-text-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-devel-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-devel-hslua-packaging-2.3.0-4zNLfL9evW33fw96RBrzdD \
ghc-devel-text-2.0.2 \
ghc-hslua-module-text"

inherit rpm
