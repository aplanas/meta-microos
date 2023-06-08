SUMMARY = "Haskell spdx profiling library"
DESCRIPTION = "This package provides the Haskell spdx profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.0.3"

RPM_NAME = "ghc-spdx-prof-1.0.0.3-1.2.aarch64.rpm"
RPM_HASH = "e24eaf8d2c622ac03561b0e79b068fb95e63a9850816d6ac4fa9713fd27b4a196b504815a93385abbeb80158a5992efc9912a772a52d3dacc01dd7e35c07afa8"

RPROVIDES:${PN} += "ghc-prof(spdx-1.0.0.3-JwdNfzEpnM57Bwmw6OiiTp) ghc-spdx-prof ghc-spdx-prof(aarch-64)"
RDEPENDS:${PN} += "ghc-prof(Cabal-3.8.1.0) ghc-prof(base-4.17.1.0) ghc-prof(containers-0.6.7) ghc-prof(transformers-0.5.6.2) ghc-spdx-devel"

inherit rpm
