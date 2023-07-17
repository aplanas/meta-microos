SUMMARY = "Haskell unix-time profiling library"
DESCRIPTION = "This package provides the Haskell unix-time profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.4.10"

RPM_NAME = "ghc-unix-time-prof-0.4.10-1.1.aarch64.rpm"
RPM_HASH = "d3223957de2c8b102a034633cd7539fc2d4bf99367f0c32d3e60dd730ce2f08d6ad53db6ed3a1edf235e2ab70cd2fb8f6b3be1a15d599b5b58b9d22983424edb"

RPROVIDES:${PN} += "ghc-prof-unix-time-0.4.10-LpZG5YAXe572FFFZnKOLQq \
ghc-unix-time-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-binary-0.8.9.1 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-old-time-1.1.0.3-6MrxIvEBZcaI0p7TDiYNU1 \
ghc-unix-time-devel"

inherit rpm
