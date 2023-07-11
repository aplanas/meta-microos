SUMMARY = "Documentation for texlive-rbt-mathnotes"
DESCRIPTION = "This package includes the documentation for texlive-rbt-mathnotes"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn61193"

RPM_NAME = "texlive-rbt-mathnotes-doc-2023.201.1.0.2svn61193-53.2.noarch.rpm"
RPM_HASH = "dcde4179dff0d262ff6158b9e2660cd32be8c27df93fd16a0fbdfd29711f307fad64573e6de114f10a6ba20a3bbd0f9e35680371d3aaa01f53fb5a67ea253cac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rbt-mathnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
