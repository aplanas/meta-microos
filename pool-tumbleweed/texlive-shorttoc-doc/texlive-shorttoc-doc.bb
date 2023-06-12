SUMMARY = "Documentation for texlive-shorttoc"
DESCRIPTION = "This package includes the documentation for texlive-shorttoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn15878"

RPM_NAME = "texlive-shorttoc-doc-2023.201.1.3svn15878-53.1.noarch.rpm"
RPM_HASH = "132f9faf064ab3a23351b221161b2810a2d33ed4b90a01bbdf60b952913337212f6faa4e6b43e618481b3b0b47a7dd7d8a774bb7a5c5d197adf412a206588d00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shorttoc-doc"
RDEPENDS:${PN} += ""

inherit rpm
