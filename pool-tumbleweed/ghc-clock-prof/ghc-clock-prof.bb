SUMMARY = "Haskell clock profiling library"
DESCRIPTION = "This package provides the Haskell clock profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.8.4"

RPM_NAME = "ghc-clock-prof-0.8.4-1.2.aarch64.rpm"
RPM_HASH = "dc68a0f78a7d41a0ef51bbe2c15e2a27744134abe40cccf954b41bf66913eda2033a7df03356aaa1a7b9ef8f4c1ef2971f2ed29acf3a6857acd475a831bd4963"

RPROVIDES:${PN} += "ghc-clock-prof \
ghc-prof-clock-0.8.4-FaEd7XcSjZTFKcoXlUaX3W"

RDEPENDS:${PN} += "ghc-clock-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
