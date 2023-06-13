SUMMARY = "Haskell auto-update profiling library"
DESCRIPTION = "This package provides the Haskell auto-update profiling library."
LICENSE = "MIT"

PV = "0.1.6"

RPM_NAME = "ghc-auto-update-prof-0.1.6-6.3.aarch64.rpm"
RPM_HASH = "443c54124b1843bfa8ed2a675e62e9e3724f59d655e5fafd8b6e3401ed7653e2b37717a621afcd7f045edb8a23dc78ce9640cf9b1f8d41d8be99c33b272c7dc7"

RPROVIDES:${PN} += "ghc-auto-update-prof \
ghc-auto-update-prof(aarch-64) \
ghc-prof(auto-update-0.1.6-CObek7rRQnGB5D6p02bNzQ)"

RDEPENDS:${PN} += "ghc-auto-update-devel \
ghc-prof(base-4.17.1.0)"

inherit rpm
