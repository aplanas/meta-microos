SUMMARY = "Documentation for texlive-latex-lab"
DESCRIPTION = "This package includes the documentation for texlive-latex-lab"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn64892"

RPM_NAME = "texlive-latex-lab-doc-2023.201.svn64892-55.1.noarch.rpm"
RPM_HASH = "a3162cd0d284f45acc9c12c27f732a22e3ad2f039b16fa3976822e21cd2aef61e474e03cfc691ae517c2d6a774d82e923d4a0e5b08b7004a01a67c092845d444"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-lab-doc"

RDEPENDS:${PN} += ""

inherit rpm
