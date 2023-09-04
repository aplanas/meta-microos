SUMMARY = "Haskell bimap profiling library"
DESCRIPTION = "This package provides the Haskell bimap profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.5.0"

RPM_NAME = "ghc-bimap-prof-0.5.0-2.3.aarch64.rpm"
RPM_HASH = "5b1b7bf011e6c9c2f13ae4276accdc47ec98d175d6d7516d5890573363652816cc28a4b89ac8869c3f562bb5f24dee5a72bab40d0f6cee889872ecb9835d6a7e"

RPROVIDES:${PN} += "ghc-bimap-prof \
ghc-prof-bimap-0.5.0-2qQthh2dRFHF2jSbEkPfEn"

RDEPENDS:${PN} += "ghc-bimap-devel \
ghc-prof-base-4.17.2.0 \
ghc-prof-containers-0.6.7 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-exceptions-0.10.5"

inherit rpm
