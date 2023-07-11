SUMMARY = "Haskell bytestring profiling library"
DESCRIPTION = "This package provides the Haskell bytestring profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.11.4.0"

RPM_NAME = "ghc-bytestring-prof-0.11.4.0-3.2.aarch64.rpm"
RPM_HASH = "d51bbb97c2a4a00ced689eeeac01806949c015a37c7e7631a0fb87e6ff88010a1668643b7257d1efeea7510929e665ea952f4498f9f0072d1830894162944d07"

RPROVIDES:${PN} += "ghc-bytestring-prof \
ghc-prof-bytestring-0.11.4.0"

RDEPENDS:${PN} += "ghc-bytestring-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-template-haskell-2.19.0.0"

inherit rpm
