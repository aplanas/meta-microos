SUMMARY = "Documentation for texlive-nicefilelist"
DESCRIPTION = "This package includes the documentation for texlive-nicefilelist"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9bsvn65842"

RPM_NAME = "texlive-nicefilelist-doc-2023.209.0.0.9bsvn65842-55.1.noarch.rpm"
RPM_HASH = "b48e5e59c4e73f30d9ac5068372cdf94193b05bd26a9fd81e2fe5def33d0893fcb3f7d645ca8d30cd6cd8b2d554e579994632ad5aa25f4cf0b948458e40d2f1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nicefilelist-doc"

RDEPENDS:${PN} += ""

inherit rpm
