SUMMARY = "Documentation for texlive-geradwp"
DESCRIPTION = "This package includes the documentation for texlive-geradwp"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn63134"

RPM_NAME = "texlive-geradwp-doc-2023.209.1.1svn63134-53.1.noarch.rpm"
RPM_HASH = "96c681e5c16bac702baaa099e8d27d67ba7118f9a7c770f143196ebf1266723bf324d1ef9f103e1cefdac661fd390ec532e4c23e486c10c62b01076a133aab57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-geradwp-doc-fr \
texlive-geradwp-doc"

RDEPENDS:${PN} += ""

inherit rpm
