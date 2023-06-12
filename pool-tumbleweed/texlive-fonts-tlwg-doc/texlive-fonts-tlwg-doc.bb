SUMMARY = "Documentation for texlive-fonts-tlwg"
DESCRIPTION = "This package includes the documentation for texlive-fonts-tlwg"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.7.3svn60817"

RPM_NAME = "texlive-fonts-tlwg-doc-2023.201.0.0.7.3svn60817-52.1.noarch.rpm"
RPM_HASH = "bb4b14e6326ffb025ec0e1c9c6a489d99f67d88dfe671a9869eb43e4097d30737dab565cbea62817475e105e0b52e49929a134153247275f989a0dd9b4e5031d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fonts-tlwg-doc"
RDEPENDS:${PN} += ""

inherit rpm
