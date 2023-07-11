SUMMARY = "Haskell array profiling library"
DESCRIPTION = "This package provides the Haskell array profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.4.0"

RPM_NAME = "ghc-array-prof-0.5.4.0-3.2.aarch64.rpm"
RPM_HASH = "cc7f507043cb1d1970a8c699025a665eb62d3cd5d32a1cf87e7f0d75a51de92b4856f1d2428898bf632a5dedf79cf94875e1bdf174ee7d65c0edcd0529754345"

RPROVIDES:${PN} += "ghc-array-prof \
ghc-prof-array-0.5.4.0"

RDEPENDS:${PN} += "ghc-array-devel \
ghc-prof-base-4.17.1.0"

inherit rpm
