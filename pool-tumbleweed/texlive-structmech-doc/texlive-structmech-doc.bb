SUMMARY = "Documentation for texlive-structmech"
DESCRIPTION = "This package includes the documentation for texlive-structmech"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn58985"

RPM_NAME = "texlive-structmech-doc-2023.201.1.1svn58985-57.1.noarch.rpm"
RPM_HASH = "78356f6865fba3fe54da2da6a7cc3e3d5be51d565417ac7156ed7ddc5ea1b7a3910551143e8df25dff599b2878fe1e0c854b6007d3875aedec72144004b2004c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-structmech-doc"

RDEPENDS:${PN} += ""

inherit rpm
