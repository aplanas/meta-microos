SUMMARY = "Haskell filepattern profiling library"
DESCRIPTION = "This package provides the Haskell filepattern profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.3"

RPM_NAME = "ghc-filepattern-prof-0.1.3-2.11.aarch64.rpm"
RPM_HASH = "df5b6ad02a42091ab471739340e3e21529d0f41e6960358a9ab76284e7c41c938131256cf93132dea3ea2f1802fa7cd3d89156e51b6ad4e3850b8520bc60563b"

RPROVIDES:${PN} += "ghc-filepattern-prof \
ghc-prof-filepattern-0.1.3-4ntZdyOJ0RX8pGnFp1xRde"

RDEPENDS:${PN} += "ghc-filepattern-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-directory-1.3.7.1 \
ghc-prof-extra-1.7.14-DfcUn0kURmM7zhMG6RTp91 \
ghc-prof-filepath-1.4.2.2"

inherit rpm
