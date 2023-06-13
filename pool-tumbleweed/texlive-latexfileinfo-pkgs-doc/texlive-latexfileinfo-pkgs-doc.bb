SUMMARY = "Documentation for texlive-latexfileinfo-pkgs"
DESCRIPTION = "This package includes the documentation for texlive-latexfileinfo-pkgs"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.22svn26760"

RPM_NAME = "texlive-latexfileinfo-pkgs-doc-2023.201.0.0.22svn26760-54.1.noarch.rpm"
RPM_HASH = "77094646143ee0a84c5d29e2df27d692694e97daae1d8ab1f9fa84fbe67198970a0c87f9eb5b2d0b91e4af470308187ed86a428063013b21b9413164d9a56dcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexfileinfo-pkgs-doc"

RDEPENDS:${PN} += ""

inherit rpm
