SUMMARY = "Documentation for texlive-labels4easylist"
DESCRIPTION = "This package includes the documentation for texlive-labels4easylist"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn51124"

RPM_NAME = "texlive-labels4easylist-doc-2023.201.1.0svn51124-55.1.noarch.rpm"
RPM_HASH = "b9236554358929839853daa08dd6b124a33ad3bf20a8979f6c3025cd71b62ec807d9e97446fa36d311c574eecb95f862324022df2832a9dfc98bf04df5193b05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-labels4easylist-doc"

RDEPENDS:${PN} += ""

inherit rpm
