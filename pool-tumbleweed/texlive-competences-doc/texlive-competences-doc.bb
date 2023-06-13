SUMMARY = "Documentation for texlive-competences"
DESCRIPTION = "This package includes the documentation for texlive-competences"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn47573"

RPM_NAME = "texlive-competences-doc-2023.201.1.0svn47573-53.1.noarch.rpm"
RPM_HASH = "520d9673aa6405ad82c3949e5f611f8052b54ba145b2f795428dc839fc7bcca36f4b27d5f07834dc74e08beccaa451167eacc0bd9f41b551eba45d82a3a42f7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-competences-doc"

RDEPENDS:${PN} += ""

inherit rpm
