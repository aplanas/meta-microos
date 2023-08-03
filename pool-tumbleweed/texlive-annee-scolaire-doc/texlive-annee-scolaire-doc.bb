SUMMARY = "Documentation for texlive-annee-scolaire"
DESCRIPTION = "This package includes the documentation for texlive-annee-scolaire"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn55988"

RPM_NAME = "texlive-annee-scolaire-doc-2023.209.1.6svn55988-55.1.noarch.rpm"
RPM_HASH = "4762da52a4aacc23b824af1c568cf3d08c9772d3d88cbc951fb7d27968068ccddc6b565bab315bae10fbad39b7d9fdb6deb79e7386004c3c06dbb2a7162524de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-annee-scolaire-doc-fr \
texlive-annee-scolaire-doc"

RDEPENDS:${PN} += ""

inherit rpm
