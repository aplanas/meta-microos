SUMMARY = "Documentation for texlive-clrdblpg"
DESCRIPTION = "This package includes the documentation for texlive-clrdblpg"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn47511"

RPM_NAME = "texlive-clrdblpg-doc-2023.209.1.0svn47511-54.1.noarch.rpm"
RPM_HASH = "f86712e7a8b494239bbafa2c18a30d476515cedcbcb337270f940b82eb3691797db5b17dddeccfed09bfcf31f2d9c8d624647b8bab21c43731970e09673b1989"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clrdblpg-doc"

RDEPENDS:${PN} += ""

inherit rpm
