SUMMARY = "Documentation for texlive-yfonts"
DESCRIPTION = "This package includes the documentation for texlive-yfonts"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn50755"

RPM_NAME = "texlive-yfonts-doc-2023.201.1.4svn50755-52.2.noarch.rpm"
RPM_HASH = "32f941ea30790da918d44d3628d7ea283e00ac91c1e61f4276b26447687c060ab814e20461716fd99cad610e3f52a819d15e17d125b7a9742c981fd6f9f30c8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
