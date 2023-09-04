SUMMARY = "Haskell ghc-heap library development files"
DESCRIPTION = "This package provides the Haskell ghc-heap library development files."
LICENSE = "BSD-3-Clause"

PV = "9.4.6"

RPM_NAME = "ghc-ghc-heap-devel-9.4.6-1.1.aarch64.rpm"
RPM_HASH = "25487f8696caea94e7431ebcdb147a8f83065053c3eac8584b7c8da1224513fbc0c4ff8a79814ebed5675aa37d7bfe38c61f8f55b4aab5190fa630ec914423de"

RPROVIDES:${PN} += "ghc-devel-ghc-heap-9.4.6 \
ghc-ghc-heap-devel \
ghc-ghc-heap-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-ghc-prim-0.9.1 \
ghc-devel-rts-1.0.2 \
ghc-ghc-heap"

inherit rpm
