SUMMARY = "Documentation for texlive-tidyres"
DESCRIPTION = "This package includes the documentation for texlive-tidyres"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn65789"

RPM_NAME = "texlive-tidyres-doc-2023.201.1.0.0svn65789-54.1.noarch.rpm"
RPM_HASH = "888f6e0a731c75d3ba143c21f8628b9c8ffa881cf22d5851a54dea1eccc87d2351dceb374e40b8270ca34c5e4544ca01d9e9ddf5ce20adc688f241b80c26c94d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tidyres-doc"
RDEPENDS:${PN} += ""

inherit rpm
