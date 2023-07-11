SUMMARY = "Haskell stm-chans profiling library"
DESCRIPTION = "This package provides the Haskell stm-chans profiling library."
LICENSE = "BSD-3-Clause"

PV = "3.0.0.9"

RPM_NAME = "ghc-stm-chans-prof-3.0.0.9-1.6.aarch64.rpm"
RPM_HASH = "56a8feafb79e57fd2732b43d4998b4af403b1c686427b92e4266216256df54cbc80c8089362c29a05db93618a229ebb2c1e43ad18e0cd2b8eb71ac1fc5d6542b"

RPROVIDES:${PN} += "ghc-prof-stm-chans-3.0.0.9-KwAuYyoo9r3GoiDPqmpN5R \
ghc-stm-chans-prof"

RDEPENDS:${PN} += "ghc-prof-base-4.17.1.0 \
ghc-prof-stm-2.5.1.0 \
ghc-stm-chans-devel"

inherit rpm
