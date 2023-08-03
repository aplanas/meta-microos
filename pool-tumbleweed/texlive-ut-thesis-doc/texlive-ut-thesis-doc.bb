SUMMARY = "Documentation for texlive-ut-thesis"
DESCRIPTION = "This package includes the documentation for texlive-ut-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1.7svn65767"

RPM_NAME = "texlive-ut-thesis-doc-2023.209.3.1.7svn65767-54.1.noarch.rpm"
RPM_HASH = "212e2b94cd6e0da820b1073a8aff2d8045aefe1d36e62e156085ba5f61da3a1d699f5002fb19a93e322a43ee5471200114ce3209371c1dccbc1d151b44544565"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ut-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
