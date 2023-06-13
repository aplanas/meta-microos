SUMMARY = "Documentation for texlive-braket"
DESCRIPTION = "This package includes the documentation for texlive-braket"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn17127"

RPM_NAME = "texlive-braket-doc-2023.201.svn17127-52.1.noarch.rpm"
RPM_HASH = "4f2e0aa1b7e611dfe5157bb063c3c934b38bb587f29302238f0856eb7012bf8c719401025d3010ceb41bf12ec94b45eedc7d723d4e87feba01723833f4dddc67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-braket-doc"

RDEPENDS:${PN} += ""

inherit rpm
