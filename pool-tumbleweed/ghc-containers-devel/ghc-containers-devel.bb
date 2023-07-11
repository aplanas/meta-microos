SUMMARY = "Haskell containers library development files"
DESCRIPTION = "This package provides the Haskell containers library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.7"

RPM_NAME = "ghc-containers-devel-0.6.7-3.2.aarch64.rpm"
RPM_HASH = "93e0e1b7b5585f6f2fec7ec71c20e15f500bc2e6ae1d3621615ab3d4567f86b4e9b67715633e983c5fd378e7e2d47ce5db4e033bbd949bf9e91643839d60fd00"

RPROVIDES:${PN} += "ghc-containers-devel \
ghc-containers-static \
ghc-devel-containers-0.6.7"

RDEPENDS:${PN} += "ghc-compiler \
ghc-containers \
ghc-devel-array-0.5.4.0 \
ghc-devel-base-4.17.1.0 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-template-haskell-2.19.0.0"

inherit rpm
