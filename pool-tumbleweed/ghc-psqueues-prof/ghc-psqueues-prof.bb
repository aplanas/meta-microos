SUMMARY = "Haskell psqueues profiling library"
DESCRIPTION = "This package provides the Haskell psqueues profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.7.3"

RPM_NAME = "ghc-psqueues-prof-0.2.7.3-2.6.aarch64.rpm"
RPM_HASH = "2eb2d6ac646a21fa174c6446f06ebb97be8638d4ff1226a7a99abbcdbfaf1b9a628b00c19f300c911b579924538e7e6bfd03be34cdeafc400baff870a5a96ddc"

RPROVIDES:${PN} += "ghc-prof-psqueues-0.2.7.3-F3Vf47seRPn11NfFVgsy6O \
ghc-psqueues-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-deepseq-1.4.8.0 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-psqueues-devel"

inherit rpm
