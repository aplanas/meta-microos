SUMMARY = "Portugal datum grids for Proj"
DESCRIPTION = "Portugal datum grids for Proj."
LICENSE = "BSD-2-Clause & CC0-1.0 & CC-BY-4.0 & CC-BY-SA-4.0 & SUSE-Public-Domain"

PV = "9.2.0"

RPM_NAME = "proj-data-pt-9.2.0-1.3.noarch.rpm"
RPM_HASH = "4f5b41daca61571036ea3e886161084554d62779d7c3469da7d0113338592c66706703558ee5312beac6c4f5d1035b49b9e071896251a012ae95fe908e47d49e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "proj-data-pt"

RDEPENDS:${PN} += ""

inherit rpm
