SUMMARY = "Haskell HTTP profiling library"
DESCRIPTION = "This package provides the Haskell HTTP profiling library."
LICENSE = "BSD-3-Clause"

PV = "4000.4.1"

RPM_NAME = "ghc-HTTP-prof-4000.4.1-1.3.aarch64.rpm"
RPM_HASH = "eaced29fdfb338450fdee6fd4be85a0d2b22166f20b21b02f3d11dbfe88313c38a804ea22078923b0665ef0d018d7aeb7586a0d0854f0f8c15944420cf29b6d7"

RPROVIDES:${PN} += "ghc-HTTP-prof ghc-HTTP-prof(aarch-64) ghc-prof(HTTP-4000.4.1-BsHtin5O4EoLpElKRODQk3)"
RDEPENDS:${PN} += "ghc-HTTP-devel ghc-prof(array-0.5.4.0) ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(mtl-2.2.2) ghc-prof(network-3.1.2.8-HNDBp0HF6t0D1fzE2MDtPd) ghc-prof(network-uri-2.6.4.2-4kNQnaE9heqEL1mH8FE5xH) ghc-prof(parsec-3.1.16.1) ghc-prof(time-1.12.2) ghc-prof(transformers-0.5.6.2)"

inherit rpm
