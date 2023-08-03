SUMMARY = "Documentation for texlive-continue"
DESCRIPTION = "This package includes the documentation for texlive-continue"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn49449"

RPM_NAME = "texlive-continue-doc-2023.209.0.0.2svn49449-55.1.noarch.rpm"
RPM_HASH = "7f8a5633a43bce7db977ae00d0caabede49fccdd88f073b1960a590b48de59f897c10b38323e506a21c7295d493adf9a0ab2363d712e769d4ea49eb6631ee18a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-continue-doc"

RDEPENDS:${PN} += ""

inherit rpm
