SUMMARY = "Documentation for texlive-multiple-choice"
DESCRIPTION = "This package includes the documentation for texlive-multiple-choice"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn63722"

RPM_NAME = "texlive-multiple-choice-doc-2023.201.0.0.2svn63722-54.1.noarch.rpm"
RPM_HASH = "883d6f63f71cc282787e53961e0a3e67f7a2a7d0037762a939b0a0e4aa294318a1da667ee99d2785161cabedae0e8c3aa1d4589fc2f906e129007d4bbf633ea2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multiple-choice-doc"
RDEPENDS:${PN} += ""

inherit rpm
