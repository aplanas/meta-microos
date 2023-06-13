SUMMARY = "Documentation for texlive-ccool"
DESCRIPTION = "This package includes the documentation for texlive-ccool"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2svn60600"

RPM_NAME = "texlive-ccool-doc-2023.201.3.2svn60600-52.1.noarch.rpm"
RPM_HASH = "a5f9b1cba87b93998ece0dc855ddffc0da8600872f8b8cd2f8f52681838286d978fc4ceff4a8b4b95197fcec8cf398bec8b07d8c44c855ab96b13c5d0f972726"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ccool-doc"

RDEPENDS:${PN} += ""

inherit rpm
