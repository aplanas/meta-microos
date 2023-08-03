SUMMARY = "Documentation for texlive-mpgraphics"
DESCRIPTION = "This package includes the documentation for texlive-mpgraphics"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn29776"

RPM_NAME = "texlive-mpgraphics-doc-2023.209.0.0.3svn29776-55.1.noarch.rpm"
RPM_HASH = "85f74f0ff36ad5f5e4c55b75c0f94702298080be115f4a21789ee9b6d8b480fc931541731d6eb2b9ce56f38179a421f06f54a8651f678212eda0446500e0107e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mpgraphics-doc"

RDEPENDS:${PN} += ""

inherit rpm
