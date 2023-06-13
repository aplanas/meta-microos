SUMMARY = "Documentation for texlive-scalebar"
DESCRIPTION = "This package includes the documentation for texlive-scalebar"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-scalebar-doc-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "b2f6f11bde899f56e88e87e4ae98472da2dafa0073ae835c6c27363d409399f5eab98c8be8607bb89fe353502781556ada9650525a14d643321a6bc82e1318ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scalebar-doc"

RDEPENDS:${PN} += ""

inherit rpm
