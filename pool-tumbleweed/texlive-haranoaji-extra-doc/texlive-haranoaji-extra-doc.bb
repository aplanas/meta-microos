SUMMARY = "Documentation for texlive-haranoaji-extra"
DESCRIPTION = "This package includes the documentation for texlive-haranoaji-extra"
LICENSE = "OFL-1.1"

PV = "2023.201.20230223svn66115"

RPM_NAME = "texlive-haranoaji-extra-doc-2023.201.20230223svn66115-53.1.noarch.rpm"
RPM_HASH = "54013d2ad20fe11cd4ea661878d26c9be0147c3eb9ea3a6a4087efc3d13e31cd57c847fb24d0bab26924e192127ceb35f485a4a39197ab8eef60b77856471ac0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-haranoaji-extra-doc"

RDEPENDS:${PN} += ""

inherit rpm
