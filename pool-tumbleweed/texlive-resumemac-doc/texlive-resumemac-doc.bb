SUMMARY = "Documentation for texlive-resumemac"
DESCRIPTION = "This package includes the documentation for texlive-resumemac"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-resumemac-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "aa29d4fecd84ff8e1fd9b544b584562b1f4bf6885b91ff0cbaefd5b1475ad71f98b722ccadbbebef12538e24b5b5685ad99cf7d3dbb13c419af10ec70fbdd70c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-resumemac-doc"

RDEPENDS:${PN} += ""

inherit rpm
