SUMMARY = "Documentation for texlive-yfonts-otf"
DESCRIPTION = "This package includes the documentation for texlive-yfonts-otf"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.43svn65030"

RPM_NAME = "texlive-yfonts-otf-doc-2023.201.0.0.43svn65030-52.1.noarch.rpm"
RPM_HASH = "46742a07baefb27967a31226d3be2d7c8e6ec59cb7d6a563a8d3cba81415bb6865cf1d6af85c024074ca98a1e3632788d2d51e64b5803520b0cafecb9c72e114"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yfonts-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
