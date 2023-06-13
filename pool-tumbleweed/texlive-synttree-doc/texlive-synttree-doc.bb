SUMMARY = "Documentation for texlive-synttree"
DESCRIPTION = "This package includes the documentation for texlive-synttree"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4.2svn16252"

RPM_NAME = "texlive-synttree-doc-2023.201.1.4.2svn16252-57.1.noarch.rpm"
RPM_HASH = "2d6082c5096098113b91baaf23c01bb7e62b8dad9d6acc0146c00b3f8101caf6ccb1677746e1446a0201a2a108e5dc6b5d7fe516a01eafbdcbba29cfd7fb404f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-synttree-doc"

RDEPENDS:${PN} += ""

inherit rpm
