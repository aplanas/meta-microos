SUMMARY = "France datum grids for Proj"
DESCRIPTION = "France datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-fr-9.2.1-1.1.noarch.rpm"
RPM_HASH = "e1b933b3471b3504ce82478712593cf3a0b4695e2634e65f5130e000b3f390f4d9d5f2bfcfe9a05e6f524407971279b67e1437875a8d84d29aae708b96716243"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-fr"

RDEPENDS:${PN} += ""

inherit rpm
