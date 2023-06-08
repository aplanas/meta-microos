SUMMARY = "Haskell parsec-numbers profiling library"
DESCRIPTION = "This package provides the Haskell parsec-numbers profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.0"

RPM_NAME = "ghc-parsec-numbers-prof-0.1.0-7.2.aarch64.rpm"
RPM_HASH = "4a43ac4f49e756ee9b7675e420ac2083601a5079e7cf68882558d5d5db507e415a5613397aa3ec67b67943e29c41ebf00ef961f6496f499db14dc51cf5be831e"

RPROVIDES:${PN} += "ghc-parsec-numbers-prof ghc-parsec-numbers-prof(aarch-64) ghc-prof(parsec-numbers-0.1.0-EpxP3vMK5SifJrb3FqKTJ)"
RDEPENDS:${PN} += "ghc-parsec-numbers-devel ghc-prof(base-4.17.1.0) ghc-prof(parsec-3.1.16.1)"

inherit rpm
