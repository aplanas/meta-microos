SUMMARY = "Documentation for texlive-greenpoint"
DESCRIPTION = "This package includes the documentation for texlive-greenpoint"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-greenpoint-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "787c7ffde6df26f69a818a8ae8adf9b3078b9c4c9d9274735800a2ac9f0b8957bd6aba2e8f46ecd13ca3d3927a61e2be778f8f7b3b8113ded2a0b618ff8ae062"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-greenpoint-doc"

RDEPENDS:${PN} += ""

inherit rpm
