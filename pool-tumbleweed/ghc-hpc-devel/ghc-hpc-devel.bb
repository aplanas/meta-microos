SUMMARY = "Haskell hpc library development files"
DESCRIPTION = "This package provides the Haskell hpc library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.0"

RPM_NAME = "ghc-hpc-devel-0.6.1.0-3.2.aarch64.rpm"
RPM_HASH = "f29f637e01542f1a56c0c690298696accbf0f0f0f38de75768e3c462bc2c2246df7108b370b20707a3da5cf87a59d2ed281d3e7eda2260231682cfa46470acf1"

RPROVIDES:${PN} += "ghc-devel-hpc-0.6.1.0 \
ghc-hpc-devel \
ghc-hpc-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.1.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-time-1.12.2 \
ghc-hpc"

inherit rpm
