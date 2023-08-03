SUMMARY = "Documentation for texlive-bxcjkjatype"
DESCRIPTION = "This package includes the documentation for texlive-bxcjkjatype"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn54080"

RPM_NAME = "texlive-bxcjkjatype-doc-2023.209.0.0.3svn54080-53.1.noarch.rpm"
RPM_HASH = "023a80aefe371e422bdcd24471f88191de0a484c42193ee467405cb6563301b2d391a8cd68818e4c135c7c3ed9305e73e81069c1575b3ada2b0a1a1968f90546"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bxcjkjatype-doc-ja;en \
texlive-bxcjkjatype-doc"

RDEPENDS:${PN} += ""

inherit rpm
