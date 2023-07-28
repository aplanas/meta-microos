SUMMARY = "Haskell network profiling library"
DESCRIPTION = "This package provides the Haskell network profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.1.4.0"

RPM_NAME = "ghc-network-prof-3.1.4.0-2.1.aarch64.rpm"
RPM_HASH = "79342a17d048ceeeea46db0fc47ea423fe48b23049526c6a555e171113bc1cd55294808cf2f8c3744d454389354cdf462cd1aeb08da42d713bff7856d477e853"

RPROVIDES:${PN} += "ghc-network-prof \
ghc-prof-network-3.1.4.0-FvtFepOtuCUH79FCWyNxIc"

RDEPENDS:${PN} += "ghc-network-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-bytestring-0.11.4.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-directory-1.3.7.1"

inherit rpm
