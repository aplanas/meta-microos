SUMMARY = "Documentation for texlive-biblatex-juradiss"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-juradiss"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.23svn56502"

RPM_NAME = "texlive-biblatex-juradiss-doc-2023.201.0.0.23svn56502-53.1.noarch.rpm"
RPM_HASH = "a033e853f534b3fd277ce158ece000c8af668c30629b9e336b74e640e12b468dfec5d71b5f17d75225f8a8bf998c6038a3611022ef0f571b0f307f75fea440ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-juradiss-doc"

RDEPENDS:${PN} += ""

inherit rpm
