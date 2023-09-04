SUMMARY = "Haskell hslua-module-version library development files"
DESCRIPTION = "This package provides the Haskell hslua-module-version library development \
files."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-version-devel-1.1.0-1.3.aarch64.rpm"
RPM_HASH = "751eb0066b28ebe96391c7535ab90f76db7a495c76f2441130b660a12789e2c1beabcc06252e8c0cdcc93bae5573a6ba1db6b6fa4797de783dfeabd0ea521f5b"

RPROVIDES:${PN} += "ghc-devel-hslua-module-version-1.1.0-C6IULHIw2X5B1pQoolTNUq \
ghc-hslua-module-version-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-hslua-core-2.3.1-H6EUAt4RUpl9ClgBncvABk \
ghc-devel-hslua-marshalling-2.3.0-7mBSxD4mqSw36NR9RXD4Dj \
ghc-devel-hslua-packaging-2.3.0-4zNLfL9evW33fw96RBrzdD \
ghc-devel-text-2.0.2 \
ghc-hslua-module-version"

inherit rpm
