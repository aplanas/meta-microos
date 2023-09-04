SUMMARY = "Haskell appar profiling library"
DESCRIPTION = "This package provides the Haskell appar profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.8"

RPM_NAME = "ghc-appar-prof-0.1.8-4.3.aarch64.rpm"
RPM_HASH = "58bab390d62deac2a526a433400fcf5dcf1f0c6346e890cc833d975c0671234e7ccd8184918ce37f1673c85bd2acc2dd6f82a9131eeb899050e26fe1d2e4f33d"

RPROVIDES:${PN} += "ghc-appar-prof \
ghc-prof-appar-0.1.8-1lWb1vtDAvc6rz1D87iAo"

RDEPENDS:${PN} += "ghc-appar-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1"

inherit rpm
