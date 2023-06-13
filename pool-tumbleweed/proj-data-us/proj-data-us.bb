SUMMARY = "United States datum grids for Proj"
DESCRIPTION = "United States datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-us-9.2.0-1.3.noarch.rpm"
RPM_HASH = "b135c9b887a1eeda2c3b6de1a2ddae5d3682a05a751a2ba83a488d24436df1018adafff89093bf72379766f3e98c9aeecc96ab33a2e7c7049348b1d593edb553"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-us"

RDEPENDS:${PN} += ""

inherit rpm
