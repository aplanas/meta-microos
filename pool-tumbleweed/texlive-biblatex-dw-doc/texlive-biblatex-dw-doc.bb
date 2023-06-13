SUMMARY = "Documentation for texlive-biblatex-dw"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-dw"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7bsvn66579"

RPM_NAME = "texlive-biblatex-dw-doc-2023.201.1.7bsvn66579-53.1.noarch.rpm"
RPM_HASH = "f94f98c81658b1146704c3c4ef79bd048d2587e744123e8a7019a1ab44eaff3b1db5115d5f968674de35cb196e84e8c9a6c8be771cd1c1211946b8839601468e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-biblatex-dw-doc:de;en) \
texlive-biblatex-dw-doc"

RDEPENDS:${PN} += ""

inherit rpm
