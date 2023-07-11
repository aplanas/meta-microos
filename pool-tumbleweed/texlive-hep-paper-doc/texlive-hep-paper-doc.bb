SUMMARY = "Documentation for texlive-hep-paper"
DESCRIPTION = "This package includes the documentation for texlive-hep-paper"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn64917"

RPM_NAME = "texlive-hep-paper-doc-2023.201.2.1svn64917-53.2.noarch.rpm"
RPM_HASH = "4cbc0543ec93bc3eda1c130370d0d453fe89c454fe4d33ff70019548ce86033e9e2fed8f7f34ccb772abd291eb4788915cdf8ff1718496085147cb9748ce718f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-paper-doc"

RDEPENDS:${PN} += ""

inherit rpm
