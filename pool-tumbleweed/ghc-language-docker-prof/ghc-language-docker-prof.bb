SUMMARY = "Haskell language-docker profiling library"
DESCRIPTION = "This package provides the Haskell language-docker profiling library."
LICENSE = "GPL-3.0-or-later"

PV = "11.0.0"

RPM_NAME = "ghc-language-docker-prof-11.0.0-1.10.aarch64.rpm"
RPM_HASH = "d2a51530dd1d49d9ee66098ed5d971415e11ef570ec0444272aef62cb5be64f7c5b450a73432735d3e9fe3624d80dde7a7a6a1e50492fb69d1222b0e4ce76282"

RPROVIDES:${PN} += "ghc-language-docker-prof \
ghc-prof-language-docker-11.0.0-2HEqMTVikVZEgpsCXsz3Cq"

RDEPENDS:${PN} += "ghc-language-docker-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-bytestring-0.11.5.1 \
ghc-prof-containers-0.6.7 \
ghc-prof-data-default-0.7.1.1-4TeAZDN81Uu1IorgFaPMOc \
ghc-prof-data-default-class-0.1.2.0-HWomeRk5e2p3WGQsDTnuAN \
ghc-prof-megaparsec-9.3.1-Jdwz39dpTDz8anub3eLd49 \
ghc-prof-prettyprinter-1.7.1-2SxWyEsMZJMFYq1EQglPJB \
ghc-prof-split-0.2.3.5-J6pekuQs6yKFxqDJQyglHu \
ghc-prof-text-2.0.2 \
ghc-prof-time-1.12.2"

inherit rpm
