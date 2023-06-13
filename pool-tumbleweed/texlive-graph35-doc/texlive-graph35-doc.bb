SUMMARY = "Documentation for texlive-graph35"
DESCRIPTION = "This package includes the documentation for texlive-graph35"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.3svn65138"

RPM_NAME = "texlive-graph35-doc-2023.201.0.0.1.3svn65138-53.1.noarch.rpm"
RPM_HASH = "a9c6be9fa2221119fb8b1a311409ac94b64b55bc68c0cac2a974589d780781cec416efbd979cd4639adaf529b0a8f90e9d331902cd7142eeffc6405dfb6e7411"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-graph35-doc:fr) \
texlive-graph35-doc"

RDEPENDS:${PN} += ""

inherit rpm
