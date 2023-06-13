SUMMARY = "Arch-independent data files for the Lugaru game"
DESCRIPTION = "This package contains arch-independent data files for the game Lugaru."
LICENSE = "CC-BY-SA-3.0 & CC-BY-SA-4.0"

PV = "1.2"

RPM_NAME = "lugaru-data-1.2-2.22.noarch.rpm"
RPM_HASH = "51e1013135747d6373347eaa39eecda7b690208885cd8650994821cb970b2902fd8ebcfac28640151ca8ce925912d1eae6fccbf2f0b4c9c1327d22c33c11078f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lugaru-data"

RDEPENDS:${PN} += "lugaru"

inherit rpm
