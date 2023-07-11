SUMMARY = "Documentation for texlive-pst-solides3d"
DESCRIPTION = "This package includes the documentation for texlive-pst-solides3d"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.34asvn61719"

RPM_NAME = "texlive-pst-solides3d-doc-2023.201.4.34asvn61719-53.2.noarch.rpm"
RPM_HASH = "4494b357bdfa264d75158f2b596981d8062c006528450febb7e1f134d610cbea923eb295b76c90a64a60050b11db6b8088131a37563265a939bc850dc80dcd9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-solides3d-doc-en \
texlive-pst-solides3d-doc"

RDEPENDS:${PN} += ""

inherit rpm
