SUMMARY = "Documentation for texlive-superiors"
DESCRIPTION = "This package includes the documentation for texlive-superiors"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.06svn51909"

RPM_NAME = "texlive-superiors-doc-2023.209.1.06svn51909-58.1.noarch.rpm"
RPM_HASH = "6ef4298df14b74b6b2e648492d26ce6c6a7c7c3aaa2ebdb96b9dc57c22fbfca84ce62f8cc6a5aed432d44b83751b89e3e92dade7ff09ef830a96b6072d9fe9cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-superiors-doc"

RDEPENDS:${PN} += ""

inherit rpm
