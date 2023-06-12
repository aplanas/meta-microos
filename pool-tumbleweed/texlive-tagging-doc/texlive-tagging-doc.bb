SUMMARY = "Documentation for texlive-tagging"
DESCRIPTION = "This package includes the documentation for texlive-tagging"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0.1svn52064"

RPM_NAME = "texlive-tagging-doc-2023.201.1.1.0.1svn52064-54.1.noarch.rpm"
RPM_HASH = "b61c4ff05d2c887d5e0cab2cdd777adcd8c8ac3952883e5cd9066a6fa4a0137d599d515315db8a9330ac1b20ed390dc71022807a1bb427bc6cc1ee5a83c803c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tagging-doc"
RDEPENDS:${PN} += ""

inherit rpm
