SUMMARY = "Documentation for texlive-rulerbox"
DESCRIPTION = "This package includes the documentation for texlive-rulerbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn50984"

RPM_NAME = "texlive-rulerbox-doc-2023.201.1.01svn50984-53.1.noarch.rpm"
RPM_HASH = "72d7cc24dc3ee85df24719c0acbb4c13bba91081fd470ac56d55c3fa16b42efebd15622cd28eb6c53375040f6e7b052d7c6f77a9aa6e0d72d287a691ade09bbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rulerbox-doc"
RDEPENDS:${PN} += ""

inherit rpm
