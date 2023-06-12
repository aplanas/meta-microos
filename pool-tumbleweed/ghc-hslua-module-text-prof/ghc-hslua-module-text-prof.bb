SUMMARY = "Haskell hslua-module-text profiling library"
DESCRIPTION = "This package provides the Haskell hslua-module-text profiling library."
LICENSE = "MIT"

PV = "1.1.0.1"

RPM_NAME = "ghc-hslua-module-text-prof-1.1.0.1-1.2.aarch64.rpm"
RPM_HASH = "578b3ff308705ac5490ba05e38f885ce359d3c6b20dd59f533debbcfc3fb63545b96d4da811de1755ef0f905ac4bf3b5f89d8546addacb811516e9439f4113e8"

RPROVIDES:${PN} += "ghc-hslua-module-text-prof \
ghc-hslua-module-text-prof(aarch-64) \
ghc-prof(hslua-module-text-1.1.0.1-EvPw7u7E7fn9ZAp58nb6qh)"
RDEPENDS:${PN} += "ghc-hslua-module-text-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC) \
ghc-prof(hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq) \
ghc-prof(hslua-packaging-2.3.0-G1L5YnYzXF0JtyxtKuFgZ4) \
ghc-prof(text-2.0.2)"

inherit rpm
