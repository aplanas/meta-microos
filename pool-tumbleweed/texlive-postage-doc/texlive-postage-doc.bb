SUMMARY = "Documentation for texlive-postage"
DESCRIPTION = "This package includes the documentation for texlive-postage"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn55920"

RPM_NAME = "texlive-postage-doc-2023.201.1.0svn55920-52.1.noarch.rpm"
RPM_HASH = "21ae709b6d5cb79809922c05e3ce2db145aca10738dd760833d505231010bc4f82eb9a587747ff7501f6c7220c15da75a8287654186a46467a71851c417be912"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-postage-doc"
RDEPENDS:${PN} += ""

inherit rpm
