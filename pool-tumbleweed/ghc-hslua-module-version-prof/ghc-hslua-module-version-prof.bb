SUMMARY = "Haskell hslua-module-version profiling library"
DESCRIPTION = "This package provides the Haskell hslua-module-version profiling library."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "ghc-hslua-module-version-prof-1.1.0-1.2.aarch64.rpm"
RPM_HASH = "738982c19a02c8a312a4e9c85f4df70884f06a5d0e88ee4ca49634dfb9b25792c6fa1744857a2baa1bf4b82f1c4586e6e127d6156afd424c912e4739622d8cfd"

RPROVIDES:${PN} += "ghc-hslua-module-version-prof \
ghc-hslua-module-version-prof(aarch-64) \
ghc-prof(hslua-module-version-1.1.0-LnOsxVbcWQY3m2SquoHReg)"
RDEPENDS:${PN} += "ghc-hslua-module-version-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(filepath-1.4.2.2) \
ghc-prof(hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC) \
ghc-prof(hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq) \
ghc-prof(hslua-packaging-2.3.0-G1L5YnYzXF0JtyxtKuFgZ4) \
ghc-prof(text-2.0.2)"

inherit rpm
