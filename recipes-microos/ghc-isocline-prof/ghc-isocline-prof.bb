SUMMARY = "Haskell isocline profiling library"
DESCRIPTION = "This package provides the Haskell isocline profiling library."
LICENSE = "MIT"

PV = "1.0.9"

RPM_NAME = "ghc-isocline-prof-1.0.9-1.3.aarch64.rpm"
RPM_HASH = "fc83381e5c3b5a7dabbdb6f98e8b0335b7faf3de88da9a1fd8019f6631aed1eff6d160dcb90bb561278daf039b6d14c64b089d4bbf779a3cef53a5f98de037f4"

RPROVIDES:${PN} += "ghc-isocline-prof ghc-isocline-prof(aarch-64) ghc-prof(isocline-1.0.9-7x8dFWbXh69GJxYhigSqXG)"
RDEPENDS:${PN} += "ghc-isocline-devel ghc-prof(base-4.17.1.0) ghc-prof(bytestring-0.11.4.0) ghc-prof(text-2.0.2)"

inherit rpm
