SUMMARY = "Haskell lua library development files"
DESCRIPTION = "This package provides the Haskell lua library development files."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ghc-lua-devel-2.3.1-1.8.aarch64.rpm"
RPM_HASH = "211243f0cfc58b76fa772219e6bc03c67d12ff8e29445f9116a5ef5a631700611740af879dbc299c2101c32ec63f57ec64fc5d1098e7d925018b8ed12f823b60"

RPROVIDES:${PN} += "ghc-devel-lua-2.3.1-IuAZ4Y3Pnt2ACNXikcgl6h \
ghc-lua-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-lua"

inherit rpm
