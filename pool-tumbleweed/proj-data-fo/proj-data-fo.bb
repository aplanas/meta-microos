SUMMARY = "Faroe Island datum grids for Proj"
DESCRIPTION = "Faroe Island datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-fo-9.2.1-1.1.noarch.rpm"
RPM_HASH = "48f969de961dc7f0fc31b498a3fff4f34dfa96737ea8b7ea730916c691ed28323ec0b1dfac4f7b96c991e529702f8ce1c9bd3f1cb70ba94d8c0b269b9bcfd593"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-fo"

RDEPENDS:${PN} += ""

inherit rpm
