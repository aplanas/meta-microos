SUMMARY = "Germany datum grids for Proj"
DESCRIPTION = "Germany datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.1"

RPM_NAME = "proj-data-de-9.2.1-1.1.noarch.rpm"
RPM_HASH = "456d08b4791093bd666add9d03565eea1732115c8baa81f0e61ca8629e777080f24c0a2e9e18c2423480580889cdf63c8334ceb320370cfa742675b74e769839"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-de"

RDEPENDS:${PN} += ""

inherit rpm
