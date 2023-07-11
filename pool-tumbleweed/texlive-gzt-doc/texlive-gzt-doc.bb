SUMMARY = "Documentation for texlive-gzt"
DESCRIPTION = "This package includes the documentation for texlive-gzt"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.3svn63591"

RPM_NAME = "texlive-gzt-doc-2023.201.1.1.3svn63591-53.2.noarch.rpm"
RPM_HASH = "4deeefc8cd1bf779bd84f444470c457530110c3fb649bc35732a6f28e661561e6a21a4d2c7f7098df0f9d5614a85076e3f665b88e3eaacd46e8c4bd20e059c14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-gzt-doc-fr \
texlive-gzt-doc"

RDEPENDS:${PN} += ""

inherit rpm
