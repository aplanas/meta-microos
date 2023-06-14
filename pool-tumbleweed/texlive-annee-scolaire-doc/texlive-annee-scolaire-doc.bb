SUMMARY = "Documentation for texlive-annee-scolaire"
DESCRIPTION = "This package includes the documentation for texlive-annee-scolaire"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn55988"

RPM_NAME = "texlive-annee-scolaire-doc-2023.201.1.6svn55988-54.1.noarch.rpm"
RPM_HASH = "16bea8329c652e7e2f56d44fc5ac017c087287a1530937efba6bdce024c053f5de8dfebd80e5baf6d797219a4826e086bf2583040e105828b36ab76f01ebc736"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-annee-scolaire-doc-fr \
texlive-annee-scolaire-doc"

RDEPENDS:${PN} += ""

inherit rpm
