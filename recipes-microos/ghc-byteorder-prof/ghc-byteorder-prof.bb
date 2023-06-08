SUMMARY = "Haskell byteorder profiling library"
DESCRIPTION = "This package provides the Haskell byteorder profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.4"

RPM_NAME = "ghc-byteorder-prof-1.0.4-4.2.aarch64.rpm"
RPM_HASH = "6da20122c36160efab1a6b0f1fa37a8c4e90c0469578fc0b26d499ab954d6bde051c6c13290ab51add9d55e94b211357c8093ff3cec0b40b6607d8089168cc66"

RPROVIDES:${PN} += "ghc-byteorder-prof ghc-byteorder-prof(aarch-64) ghc-prof(byteorder-1.0.4-3C2mbNH4DNU4EJIfEbmhBl)"
RDEPENDS:${PN} += "ghc-byteorder-devel ghc-prof(base-4.17.1.0)"

inherit rpm
