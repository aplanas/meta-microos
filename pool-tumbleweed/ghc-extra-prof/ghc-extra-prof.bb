SUMMARY = "Haskell extra profiling library"
DESCRIPTION = "This package provides the Haskell extra profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.7.14"

RPM_NAME = "ghc-extra-prof-1.7.14-1.3.aarch64.rpm"
RPM_HASH = "9ac5febf2ae252dedaf9e2b3be25f0fc52d93e6c3bf48945930b0eda34bd52750d95cc1d58d3de391be126c59764a2e27ca7c728b73da25707a47a9e05c3cd41"

RPROVIDES:${PN} += "ghc-extra-prof \
ghc-prof-extra-1.7.14-DfcUn0kURmM7zhMG6RTp91"

RDEPENDS:${PN} += "ghc-extra-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-clock-0.8.4-FaEd7XcSjZTFKcoXlUaX3W \
ghc-prof-directory-1.3.7.1 \
ghc-prof-filepath-1.4.2.2 \
ghc-prof-process-1.6.17.0 \
ghc-prof-time-1.12.2 \
ghc-prof-unix-2.7.3"

inherit rpm
