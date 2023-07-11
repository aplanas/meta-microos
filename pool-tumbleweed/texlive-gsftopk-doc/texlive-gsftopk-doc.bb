SUMMARY = "Documentation for texlive-gsftopk"
DESCRIPTION = "This package includes the documentation for texlive-gsftopk"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.19.2svn52851"

RPM_NAME = "texlive-gsftopk-doc-2023.201.1.19.2svn52851-53.2.noarch.rpm"
RPM_HASH = "57beebfb65fa70cf6c036129fa36fa555cde9718c0840cc5fc9abbed61c83bc694471dfd6ad498e2f878e81254c19b45e824945b834509c42d5ac43bbb06b9b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-gsftopk.1 \
texlive-gsftopk-doc"

RDEPENDS:${PN} += ""

inherit rpm
