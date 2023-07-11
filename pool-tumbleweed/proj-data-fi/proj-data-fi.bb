SUMMARY = "Finland datum grids for Proj"
DESCRIPTION = "Finland datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-fi-9.2.1-1.1.noarch.rpm"
RPM_HASH = "e0da86be5889daafa3139c9897f84484caeade582f87e41254084f6ac52d204e9b7101b6fa0d2ba7afdeda0f46f939708885ef28e9bd2ba89420bf0737e15343"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-fi"

RDEPENDS:${PN} += ""

inherit rpm
