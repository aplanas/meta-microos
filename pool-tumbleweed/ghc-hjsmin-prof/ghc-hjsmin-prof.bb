SUMMARY = "Haskell hjsmin profiling library"
DESCRIPTION = "This package provides the Haskell hjsmin profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.1"

RPM_NAME = "ghc-hjsmin-prof-0.2.1-1.5.aarch64.rpm"
RPM_HASH = "a665322847c8cac69ff6a6659a2893fe8084bd4307c01c29ac720b5af3b226a0f9132d21fcfc61f483f964a47d94bc88370988da5059106ecc5592c0b92fced3"

RPROVIDES:${PN} += "ghc-hjsmin-prof \
ghc-prof-hjsmin-0.2.1-E05vLEwNeV76Uzm2zhD4uI"

RDEPENDS:${PN} += "ghc-hjsmin-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-language-javascript-0.7.1.0-3FqnIQtG3956Mxug7EpqjM \
ghc-prof-text-2.0.2"

inherit rpm
