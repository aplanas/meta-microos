SUMMARY = "Haskell stm-chans profiling library"
DESCRIPTION = "This package provides the Haskell stm-chans profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.0.0.9"

RPM_NAME = "ghc-stm-chans-prof-3.0.0.9-1.3.aarch64.rpm"
RPM_HASH = "6ded45df01e39f7c50b976dc0ff3f5cc27608c072c28e2d87e8ef2c809e4dd304a23d0c08fd750fec4025677db1e6913f79bf2c22b1a1b6fbec8e2e859f7a718"

RPROVIDES:${PN} += "ghc-prof(stm-chans-3.0.0.9-KwAuYyoo9r3GoiDPqmpN5R) \
ghc-stm-chans-prof \
ghc-stm-chans-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(stm-2.5.1.0) \
ghc-stm-chans-devel"

inherit rpm
