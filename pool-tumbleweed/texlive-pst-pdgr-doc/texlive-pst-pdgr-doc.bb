SUMMARY = "Documentation for texlive-pst-pdgr"
DESCRIPTION = "This package includes the documentation for texlive-pst-pdgr"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn45875"

RPM_NAME = "texlive-pst-pdgr-doc-2023.201.0.0.4svn45875-53.2.noarch.rpm"
RPM_HASH = "c0211d5d039ca93bd049a8a32dad5643413d418b10020b9d152baa2fe374f8592117daca31f136d414e974a8ab8b56bbac3de3d8a0723800e5d94e6dd3fc6913"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-pdgr-doc"

RDEPENDS:${PN} += ""

inherit rpm
