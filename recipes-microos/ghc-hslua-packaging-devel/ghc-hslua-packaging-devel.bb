SUMMARY = "Haskell hslua-packaging library development files"
DESCRIPTION = "This package provides the Haskell hslua-packaging library development \
files."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "ghc-hslua-packaging-devel-2.3.0-1.3.aarch64.rpm"
RPM_HASH = "ce65226478ca29500265d2e36f4b4101fa4318fdc0b30fc5478fe448184a374ff6d92a09f69d0ebb8c9e563c55abe48b70fd5c37809c4318fb8e54cb6aed9532"

RPROVIDES:${PN} += "ghc-devel(hslua-packaging-2.3.0-G1L5YnYzXF0JtyxtKuFgZ4) ghc-hslua-packaging-devel ghc-hslua-packaging-devel(aarch-64)"
RDEPENDS:${PN} += "/bin/sh ghc-compiler ghc-devel(base-4.17.1.0) ghc-devel(containers-0.6.7) ghc-devel(hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC) ghc-devel(hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq) ghc-devel(hslua-objectorientation-2.3.0-7bmusH4WO3b1DlNe7DJ9Sl) ghc-devel(hslua-typing-0.1.0-DOIXLkV8dkhE96ObTX1Ndj) ghc-devel(mtl-2.2.2) ghc-devel(text-2.0.2) ghc-hslua-packaging"

inherit rpm
