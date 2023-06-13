SUMMARY = "Documentation for texlive-combofont"
DESCRIPTION = "This package includes the documentation for texlive-combofont"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn51348"

RPM_NAME = "texlive-combofont-doc-2023.201.0.0.3svn51348-53.1.noarch.rpm"
RPM_HASH = "68729c9a2e25baf15daee7d1d69105fa209aae3cb165cf71d058b3f2d245e182c1f1dda28fadf42f774a534d7cb6d515f653eab1dec6b87719503097b2a8bdd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-combofont-doc"

RDEPENDS:${PN} += ""

inherit rpm
