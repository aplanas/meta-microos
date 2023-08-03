SUMMARY = "Documentation for texlive-pst-tools"
DESCRIPTION = "This package includes the documentation for texlive-pst-tools"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.12svn60621"

RPM_NAME = "texlive-pst-tools-doc-2023.209.0.0.12svn60621-54.1.noarch.rpm"
RPM_HASH = "ca4b637b4a9587f59f6c741e363baacbb4bc0eb9522365fc64d042c922ad5f73ec4ae5794ecd27f2b13a88f2641a4b7be757182bd8a551c79dbca0cafc90ed2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-tools-doc"

RDEPENDS:${PN} += ""

inherit rpm
