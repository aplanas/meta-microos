SUMMARY = "Norway datum grids for Proj"
DESCRIPTION = "Norway datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-no-9.2.0-1.3.noarch.rpm"
RPM_HASH = "681728739915ed27a08597bea5368a3e20a4a1dbb266522a4d0ad53c6a763c6bdbf84214def2ff0c3ca46411e796ab7229ab8378805e6c4d3b3aa8f329cf3623"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-no"

RDEPENDS:${PN} += ""

inherit rpm
