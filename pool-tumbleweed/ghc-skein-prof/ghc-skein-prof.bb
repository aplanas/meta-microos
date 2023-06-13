SUMMARY = "Haskell skein profiling library"
DESCRIPTION = "This package provides the Haskell skein profiling library."
LICENSE = "BSD-3-Clause"

PV = "1.0.9.4"

RPM_NAME = "ghc-skein-prof-1.0.9.4-4.2.aarch64.rpm"
RPM_HASH = "127f2b3b9f6698523adf17a43eda9283a6b83c18beec2ca065bf2755dc068224e2bc7500e6c00673a614b81ee28b2024966cfe2360d433e7e912bf3d6b23f174"

RPROVIDES:${PN} += "ghc-prof(skein-1.0.9.4-C8WZ6GadOdNJdCjx57swFO) \
ghc-skein-prof \
ghc-skein-prof(aarch-64)"

RDEPENDS:${PN} += "ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(cereal-0.5.8.3-LNsxCTyOF85AKtb4iLTs8f) \
ghc-prof(crypto-api-0.13.3-9orTVpCmnZz79j7elcs5GE) \
ghc-prof(tagged-0.8.7-CYOhX22Df3PFW5V1S0dOJa) \
ghc-skein-devel"

inherit rpm
