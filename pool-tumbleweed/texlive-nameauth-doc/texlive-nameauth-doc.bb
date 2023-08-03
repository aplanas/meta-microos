SUMMARY = "Documentation for texlive-nameauth"
DESCRIPTION = "This package includes the documentation for texlive-nameauth"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.7svn65738"

RPM_NAME = "texlive-nameauth-doc-2023.209.3.7svn65738-55.1.noarch.rpm"
RPM_HASH = "86c61507faaa0d9bca4f7b25e8775e090fd41450734e4e78be88740ae624fd1f5f99f7a822aff343229c43e8c7cdbc85e0dae5b0eb52a40d0f2b2d5096e930a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nameauth-doc"

RDEPENDS:${PN} += ""

inherit rpm
