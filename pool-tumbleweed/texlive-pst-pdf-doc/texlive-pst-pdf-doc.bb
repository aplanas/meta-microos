SUMMARY = "Documentation for texlive-pst-pdf"
DESCRIPTION = "This package includes the documentation for texlive-pst-pdf"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2fsvn56622"

RPM_NAME = "texlive-pst-pdf-doc-2023.201.1.2fsvn56622-53.1.noarch.rpm"
RPM_HASH = "114154f18f98112ac2615802848ec38bf7b9af2544eba1646050c4b3f5e71ead45621cd1ca459fa2a0b383dff2b2917ef83c541cac72ab8b19032d736ed9bcbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-pdf-doc-de;en \
texlive-pst-pdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
