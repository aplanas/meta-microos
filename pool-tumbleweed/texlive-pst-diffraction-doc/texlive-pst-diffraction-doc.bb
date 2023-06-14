SUMMARY = "Documentation for texlive-pst-diffraction"
DESCRIPTION = "This package includes the documentation for texlive-pst-diffraction"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.03svn62977"

RPM_NAME = "texlive-pst-diffraction-doc-2023.201.2.03svn62977-52.1.noarch.rpm"
RPM_HASH = "471b99aed41deab0ae7f15259608b26810edb23380cbd160e726b12686a09f82600b7027e5f786ee7442ccbd3d1d067362b9ada63ea90978a2b9b90cc7547172"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-diffraction-doc-de;en;fr \
texlive-pst-diffraction-doc"

RDEPENDS:${PN} += ""

inherit rpm
