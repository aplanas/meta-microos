SUMMARY = "Documentation for texlive-warning"
DESCRIPTION = "This package includes the documentation for texlive-warning"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn22028"

RPM_NAME = "texlive-warning-doc-2023.201.0.0.01svn22028-53.1.noarch.rpm"
RPM_HASH = "d48033765ecd1bfd9b7a458352a296524c032efdac49acd1171a66c8e1263b6a0c2b12938556c4dc689697242e0666351f938aa4786df6445c2d136eb43617b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-warning-doc"
RDEPENDS:${PN} += ""

inherit rpm
