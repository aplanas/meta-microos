SUMMARY = "Documentation for texlive-signchart"
DESCRIPTION = "This package includes the documentation for texlive-signchart"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn39707"

RPM_NAME = "texlive-signchart-doc-2023.201.1.01svn39707-53.1.noarch.rpm"
RPM_HASH = "ee10d12dd364af9211a2ff00dd9025ab5a5e167ad0aa29b9850e2c1fe4443b2b677179d775717f1948c008b7e6600b4220a84d5ff16708a055693e5ac641c326"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-signchart-doc"
RDEPENDS:${PN} += ""

inherit rpm
