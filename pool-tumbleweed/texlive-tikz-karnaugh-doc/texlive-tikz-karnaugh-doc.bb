SUMMARY = "Documentation for texlive-tikz-karnaugh"
DESCRIPTION = "This package includes the documentation for texlive-tikz-karnaugh"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn62040"

RPM_NAME = "texlive-tikz-karnaugh-doc-2023.209.1.5svn62040-53.1.noarch.rpm"
RPM_HASH = "f04b959ffca4327316bb2fb1a0183a8d4fb0ee41ed28cd43dd6f58fcc367423429f4e1e2bd9a767485ad681e46a2050b8f993490aee24f02e8b1efb7ae53018a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-karnaugh-doc"

RDEPENDS:${PN} += ""

inherit rpm
