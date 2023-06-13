SUMMARY = "Documentation for texlive-shapes"
DESCRIPTION = "This package includes the documentation for texlive-shapes"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn42428"

RPM_NAME = "texlive-shapes-doc-2023.201.1.1svn42428-53.1.noarch.rpm"
RPM_HASH = "92b6b3638d26725c5d04aa79290a37adf53331e85fcea252f1c876e5a99575a32f4022b9ddd36d8a667c08d8684ad005290dc6342def47913b09f1c506a5cc15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shapes-doc"

RDEPENDS:${PN} += ""

inherit rpm
