SUMMARY = "Documentation for texlive-tagpair"
DESCRIPTION = "This package includes the documentation for texlive-tagpair"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn42138"

RPM_NAME = "texlive-tagpair-doc-2023.201.1.1svn42138-54.1.noarch.rpm"
RPM_HASH = "db2c8efe2c21edb70d078873b4881c1abfea8ece86a8539f487cf78ae1d265f86cf3505b1d8ef468ee2e2195fc4abefe0d6fd7e594349897749c96bbf1959ac0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tagpair-doc"
RDEPENDS:${PN} += ""

inherit rpm
