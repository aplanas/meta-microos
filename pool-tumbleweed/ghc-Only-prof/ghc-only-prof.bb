SUMMARY = "Haskell Only profiling library"
DESCRIPTION = "This package provides the Haskell Only profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1"

RPM_NAME = "ghc-Only-prof-0.1-5.2.aarch64.rpm"
RPM_HASH = "066df0db6968783983a27c697d130e5c8028ad833d5dac17543f0a7df6876581c0fdc533b7de57a6fb091bce5cf247feb5c312b8d20826b219f42debe7bc79f5"

RPROVIDES:${PN} += "ghc-Only-prof \
ghc-Only-prof(aarch-64) \
ghc-prof(Only-0.1-ETd5YCT0TwGLbN8rgpgTS8)"
RDEPENDS:${PN} += "ghc-Only-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(deepseq-1.4.8.0)"

inherit rpm
