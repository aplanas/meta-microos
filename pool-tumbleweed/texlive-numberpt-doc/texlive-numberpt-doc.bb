SUMMARY = "Documentation for texlive-numberpt"
DESCRIPTION = "This package includes the documentation for texlive-numberpt"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn51640"

RPM_NAME = "texlive-numberpt-doc-2023.209.1.0svn51640-55.1.noarch.rpm"
RPM_HASH = "049384751104524cb2dd7320a43b600159538dcb3be7d28d9f57bd7eab9b27daa29261155d57a632312d67584ec7d221277c5694d81a32860dd701868b0c039a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numberpt-doc"

RDEPENDS:${PN} += ""

inherit rpm
