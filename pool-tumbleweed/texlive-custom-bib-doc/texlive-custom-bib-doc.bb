SUMMARY = "Documentation for texlive-custom-bib"
DESCRIPTION = "This package includes the documentation for texlive-custom-bib"
LICENSE = "LPPL-1.0"

PV = "2023.204.4.33svn24729"

RPM_NAME = "texlive-custom-bib-doc-2023.204.4.33svn24729-54.1.noarch.rpm"
RPM_HASH = "9a856c483d0a7bf92c060489115459ea86fa4ad9670e1e7220381c8fa62593370133d977932c987b8e930008d72c350dbaff2c2cebb0bdc16bb0e9e62bda42c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-custom-bib-doc"

RDEPENDS:${PN} += ""

inherit rpm
