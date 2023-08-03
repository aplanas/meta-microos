SUMMARY = "Documentation for texlive-plantslabels"
DESCRIPTION = "This package includes the documentation for texlive-plantslabels"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn29803"

RPM_NAME = "texlive-plantslabels-doc-2023.209.1.0svn29803-52.1.noarch.rpm"
RPM_HASH = "3424f86a3b1857820e6cabf53339deee32d30fc6a35811e9b34c55ee770262306a8d3e20bcb913568ec8a2c0bcdfdfae8c404520bc614204d92472abb630c945"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plantslabels-doc"

RDEPENDS:${PN} += ""

inherit rpm
