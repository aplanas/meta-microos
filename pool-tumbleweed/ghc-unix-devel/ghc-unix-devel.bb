SUMMARY = "Haskell unix library development files"
DESCRIPTION = "This package provides the Haskell unix library development files."
LICENSE = "BSD-3-Clause"

PV = "2.7.3"

RPM_NAME = "ghc-unix-devel-2.7.3-1.1.aarch64.rpm"
RPM_HASH = "9c1c3e68ef3d190fb2d1ceaa0dc45e03a341dc4dc308decab8e135da69909db7f0474e1494e17549fde6dafd6fd5024d40bace5c1d12d1ebb9bf348e88270b76"

RPROVIDES:${PN} += "ghc-devel-unix-2.7.3 \
ghc-unix-devel \
ghc-unix-static"

RDEPENDS:${PN} += "ghc-compiler \
ghc-devel-base-4.17.2.0 \
ghc-devel-bytestring-0.11.5.1 \
ghc-devel-time-1.12.2 \
ghc-unix"

inherit rpm
