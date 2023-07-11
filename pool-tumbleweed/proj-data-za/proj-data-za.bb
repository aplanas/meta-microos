SUMMARY = "South Africa datum grids for Proj"
DESCRIPTION = "South Africa datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-za-9.2.1-1.1.noarch.rpm"
RPM_HASH = "b3ea5d78b618c25a88249f543f01e6542b98e012d2becb0595acf7524939e2b187207c08e798b327c4e9dd0fde1f027471742c77ac8cfff52ef9ad7480b3efe4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-za"

RDEPENDS:${PN} += ""

inherit rpm
