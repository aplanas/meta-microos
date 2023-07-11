SUMMARY = "Haskell unix-compat profiling library"
DESCRIPTION = "This package provides the Haskell unix-compat profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.6"

RPM_NAME = "ghc-unix-compat-prof-0.6-3.6.aarch64.rpm"
RPM_HASH = "7aed70004a7362df42a7763f66d2c7c068b9b0f369ebb70e002c477456640b67145e425b83caf73b4fe20866053196723bfaa32e8c2173554216a683325499c0"

RPROVIDES:${PN} += "ghc-prof-unix-compat-0.6-79KxxZMmklx25hsmeEnenN \
ghc-unix-compat-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-unix-2.7.3 \
ghc-unix-compat-devel"

inherit rpm
