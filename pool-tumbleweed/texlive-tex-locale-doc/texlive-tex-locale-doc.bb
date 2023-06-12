SUMMARY = "Documentation for texlive-tex-locale"
DESCRIPTION = "This package includes the documentation for texlive-tex-locale"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn48500"

RPM_NAME = "texlive-tex-locale-doc-2023.201.1.0svn48500-54.1.noarch.rpm"
RPM_HASH = "b22a5e9603b5d15c5c541d406d1ddfbdf0de79dea169c55d67bec7f2bca6cacac4507fb68d21c70dd023bcc23ca97a296b66efb9671cfedb83952e403d3f4772"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-locale-doc"
RDEPENDS:${PN} += ""

inherit rpm
