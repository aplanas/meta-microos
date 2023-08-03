SUMMARY = "Documentation for texlive-froufrou"
DESCRIPTION = "This package includes the documentation for texlive-froufrou"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4.0svn59103"

RPM_NAME = "texlive-froufrou-doc-2023.209.1.4.0svn59103-53.1.noarch.rpm"
RPM_HASH = "07294f54a4fe26b708dcc8ff13340b640b3b0f89ceca257075c92670d39ee81cdfaf9e13225e004a40e7a45e0a87fb381c2cffbb4b1a3d3cbaf74a1938be8959"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-froufrou-doc"

RDEPENDS:${PN} += ""

inherit rpm
