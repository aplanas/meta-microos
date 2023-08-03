SUMMARY = "Documentation for texlive-biblatex-dw"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-dw"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7bsvn66579"

RPM_NAME = "texlive-biblatex-dw-doc-2023.209.1.7bsvn66579-54.1.noarch.rpm"
RPM_HASH = "52f85cc3a2658145111f53dc0469c9cd4002b29e0aa8a5af7da189c2c5e21e5c9dc77d1a9564d89b8d9610d62f9b70dcca68e8e464e0a0372fe2eea4ac843957"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-dw-doc-de;en \
texlive-biblatex-dw-doc"

RDEPENDS:${PN} += ""

inherit rpm
