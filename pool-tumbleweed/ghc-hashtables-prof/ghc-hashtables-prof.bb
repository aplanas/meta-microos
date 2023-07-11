SUMMARY = "Haskell hashtables profiling library"
DESCRIPTION = "This package provides the Haskell hashtables profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "ghc-hashtables-prof-1.3.1-1.6.aarch64.rpm"
RPM_HASH = "3b82ddc00620f0b4f22d7bdf5b18ff952c9fd6ad86e5be3627a2663f1dad84de4e2175d52b66fa4c9345e9b31f030233583a6fb291a76bc71a130ff639362cd3"

RPROVIDES:${PN} += "ghc-hashtables-prof \
ghc-prof-hashtables-1.3.1-AhYwUdJr2hP9YbqppAld0p"

RDEPENDS:${PN} += "ghc-hashtables-devel \
ghc-prof-base-4.17.1.0 \
ghc-prof-ghc-prim-0.9.0 \
ghc-prof-hashable-1.4.2.0-FFBRhuY0w4YLmuLEs5uQAt \
ghc-prof-primitive-0.7.4.0-AeB0oysC3TAJw9tDpuX8hq \
ghc-prof-vector-0.13.0.0-AbjrQrWxuFpAjIHk3G7xsp"

inherit rpm
