SUMMARY = "Haskell hslua-module-system profiling library"
DESCRIPTION = "This package provides the Haskell hslua-module-system profiling library."
LICENSE = "MIT"

PV = "1.1.0.1"

RPM_NAME = "ghc-hslua-module-system-prof-1.1.0.1-1.2.aarch64.rpm"
RPM_HASH = "6205767027b5bc559894d9880c7806e1a51cabcfbb59e6ece0010f65819dcdb474b1c4cdfb62e7e6c2ec27e8026e19b6a09a92c5c4ac0163ff3de45571a87b4a"

RPROVIDES:${PN} += "ghc-hslua-module-system-prof ghc-hslua-module-system-prof(aarch-64) ghc-prof(hslua-module-system-1.1.0.1-7243M7wFNHXL9pjhXYmDQK)"
RDEPENDS:${PN} += "ghc-hslua-module-system-devel ghc-prof(base-4.17.1.0) ghc-prof(directory-1.3.7.1) ghc-prof(exceptions-0.10.5) ghc-prof(hslua-core-2.3.1-S0Tmk0QBS1InOMEfkNHVC) ghc-prof(hslua-marshalling-2.3.0-1lHdh994uwdEmrYudOnEBq) ghc-prof(hslua-packaging-2.3.0-G1L5YnYzXF0JtyxtKuFgZ4) ghc-prof(temporary-1.3-9rLWZg49Shk3gKExST32p) ghc-prof(text-2.0.2)"

inherit rpm
