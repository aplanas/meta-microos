SUMMARY = "Documentation for texlive-njuvisual"
DESCRIPTION = "This package includes the documentation for texlive-njuvisual"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.0svn65261"

RPM_NAME = "texlive-njuvisual-doc-2023.201.0.0.3.0svn65261-54.1.noarch.rpm"
RPM_HASH = "04eb9de12cbd951c790a397b6566975e76e9617321ff173df12212fa38178f147ad6c9e0c36aca0c7947ef74137e3c33f0f8bb34e6426db208e7f2f6e75b6753"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-njuvisual-doc-zh \
texlive-njuvisual-doc"

RDEPENDS:${PN} += ""

inherit rpm
