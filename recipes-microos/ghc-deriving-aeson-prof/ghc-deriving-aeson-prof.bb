SUMMARY = "Haskell deriving-aeson profiling library"
DESCRIPTION = "This package provides the Haskell deriving-aeson profiling library."
LICENSE = "BSD-3-Clause"

PV = "0.2.9"

RPM_NAME = "ghc-deriving-aeson-prof-0.2.9-2.2.aarch64.rpm"
RPM_HASH = "ec89a8c8214b7887a2bdb5f69a619498d253d240ff96ba98ec4b5d7254e2605230f86eb8392fed7bac893b462aed1548bd9f0503e9f64a67b8538482c04c9f3a"

RPROVIDES:${PN} += "ghc-deriving-aeson-prof ghc-deriving-aeson-prof(aarch-64) ghc-prof(deriving-aeson-0.2.9-HkCtwpD3IaS9WeJeVKU34M)"
RDEPENDS:${PN} += "ghc-deriving-aeson-devel ghc-prof(aeson-2.1.2.1-D6AdQzPi657L86q5kYUhvP) ghc-prof(base-4.17.1.0)"

inherit rpm
