SUMMARY = "Documentation for texlive-pst-optic"
DESCRIPTION = "This package includes the documentation for texlive-pst-optic"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.02svn62977"

RPM_NAME = "texlive-pst-optic-doc-2023.201.1.02svn62977-52.1.noarch.rpm"
RPM_HASH = "e109bc0adfc70264f13b82088b5054956882cfd1f1b865fe3a3e4d2bb848ae354118818375852ee2e5e59a19f3f619f38c3c3f57d5e43ee21619d3b5812905a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-optic-doc"

RDEPENDS:${PN} += ""

inherit rpm
