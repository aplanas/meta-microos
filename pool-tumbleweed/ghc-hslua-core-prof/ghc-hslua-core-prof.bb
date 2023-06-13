SUMMARY = "Haskell hslua-core profiling library"
DESCRIPTION = "This package provides the Haskell hslua-core profiling library."
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "ghc-hslua-core-prof-2.3.1-1.3.aarch64.rpm"
RPM_HASH = "80bcb8e2e25a48c18b24cca181ccb07a0e4afb3d0efddda388b8736ef31dfed379b7686b62b56526ed6e83466e2fa6aa0361381a19c335f04ade0d4b3a61c667"

RPROVIDES:${PN} += "ghc-hslua-core-prof \
ghc-hslua-core-prof(aarch-64) \
ghc-prof(hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC)"

RDEPENDS:${PN} += "ghc-hslua-core-devel \
ghc-prof(base-4.17.1.0) \
ghc-prof(bytestring-0.11.4.0) \
ghc-prof(exceptions-0.10.5) \
ghc-prof(lua-2.3.1-16mGxirchUh4T3oJJYdFzu) \
ghc-prof(mtl-2.2.2) \
ghc-prof(text-2.0.2)"

inherit rpm
