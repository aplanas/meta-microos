SUMMARY = "Documentation for texlive-starfont"
DESCRIPTION = "This package includes the documentation for texlive-starfont"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.2svn19982"

RPM_NAME = "texlive-starfont-doc-2023.201.1.2svn19982-57.1.noarch.rpm"
RPM_HASH = "f33d8c382271ebb8c13304323eeb6e09cc586ab2ae6e123ceee4a721499ac1c47afeb380bccc724f5ceff29c2d1dd3d2dfcd2cd36fcc8150d8dec24a073d2078"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-starfont-doc"

RDEPENDS:${PN} += ""

inherit rpm
