SUMMARY = "Haskell extensible-exceptions profiling library"
DESCRIPTION = "This package provides the Haskell extensible-exceptions profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.1.1.4"

RPM_NAME = "ghc-extensible-exceptions-prof-0.1.1.4-7.3.aarch64.rpm"
RPM_HASH = "1459945aaed3e8cac50cc018fb037fa5bd86b03f5d4aeffbc44ef4efb61525ead6bdd7fc9a7f547d4452e3d176fccd595fb015a500de81c257333d4d519f2369"

RPROVIDES:${PN} += "ghc-extensible-exceptions-prof \
ghc-prof-extensible-exceptions-0.1.1.4-1hcTiYLx0LbAr3mhUvVP0e"

RDEPENDS:${PN} += "ghc-extensible-exceptions-devel \
ghc-prof-base-4.17.2.0"

inherit rpm
