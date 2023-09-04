SUMMARY = "Haskell hpc library development files"
DESCRIPTION = "This package provides the Haskell hpc library development files."
LICENSE = "BSD-3-Clause"

PV = "0.6.1.0"

RPM_NAME = "ghc-hpc-devel-0.6.1.0-1.1.aarch64.rpm"
RPM_HASH = "daf78f52f0d1d14f7177caf5c47e1cc0af36e94e10b7d9b8a9cbcf3b71d1fc567297aa1ea02c844800ee8828cb7012816f1c444a8098179d060b56b777e87c83"

RPROVIDES:${PN} += "ghc-devel-hpc-0.6.1.0 \
ghc-hpc-devel \
ghc-hpc-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-containers-0.6.7 \
ghc-devel-deepseq-1.4.8.0 \
ghc-devel-directory-1.3.7.1 \
ghc-devel-filepath-1.4.2.2 \
ghc-devel-time-1.12.2 \
ghc-hpc"

inherit rpm
