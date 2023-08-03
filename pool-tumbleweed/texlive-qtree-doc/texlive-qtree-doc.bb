SUMMARY = "Documentation for texlive-qtree"
DESCRIPTION = "This package includes the documentation for texlive-qtree"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.1bsvn15878"

RPM_NAME = "texlive-qtree-doc-2023.209.3.1bsvn15878-54.1.noarch.rpm"
RPM_HASH = "abdbbe1953868f3ecb727e30ae4838a4e038dea553c92fb4be9392ea31cc3f4f2ed17d692aa4e9cf8a32bb9839e20a486bd890f3601fff29f976393ee44f1120"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-qtree-doc-en \
texlive-qtree-doc"

RDEPENDS:${PN} += ""

inherit rpm
