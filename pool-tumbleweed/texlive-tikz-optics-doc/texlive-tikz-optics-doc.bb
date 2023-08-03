SUMMARY = "Documentation for texlive-tikz-optics"
DESCRIPTION = "This package includes the documentation for texlive-tikz-optics"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2.3svn62977"

RPM_NAME = "texlive-tikz-optics-doc-2023.209.0.0.2.3svn62977-53.1.noarch.rpm"
RPM_HASH = "3fa4d597ab9eee0c5685bbcefe6d4f9032232139171554ce7cd8545fe88ea34cd24f1dfb28a1847dad7142f481c92eb4257db500aed73f47e8acf210000da485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tikz-optics-doc-fr \
texlive-tikz-optics-doc"

RDEPENDS:${PN} += ""

inherit rpm
