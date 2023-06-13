SUMMARY = "Haskell fgl profiling library"
DESCRIPTION = "This package provides the Haskell fgl profiling library."
LICENSE = "BSD-3-Clause"

PV = "5.8.0.0"

RPM_NAME = "ghc-fgl-prof-5.8.0.0-2.3.aarch64.rpm"
RPM_HASH = "f1b8f8a22263068c2a6b3fad6ae8ac25da79db7be05c112433388f2febf48c7ce674ca6202a174c3b2bd3dee7fcfe35e250dfdd4d12ccb2659b8fc5bb5bf8e31"

RPROVIDES:${PN} += "ghc-fgl-prof \
ghc-fgl-prof(aarch-64) \
ghc-prof(fgl-5.8.0.0-1euDADByC3LGFbnFGelVpn)"

RDEPENDS:${PN} += "ghc-fgl-devel \
ghc-prof(array-0.5.4.0) \
ghc-prof(base-4.17.1.0) \
ghc-prof(containers-0.6.7) \
ghc-prof(deepseq-1.4.8.0) \
ghc-prof(transformers-0.5.6.2)"

inherit rpm
