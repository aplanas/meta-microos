SUMMARY = "Documentation for texlive-yfonts-otf"
DESCRIPTION = "This package includes the documentation for texlive-yfonts-otf"
LICENSE = "OFL-1.1"

PV = "2023.201.0.0.43svn65030"

RPM_NAME = "texlive-yfonts-otf-doc-2023.201.0.0.43svn65030-52.2.noarch.rpm"
RPM_HASH = "670dcb7647ca5225168d14fa1a1c33590e4d25c1dd3143ec1556b2389c7d12e1264b162d3f281bffc9cc58378fa6ead392eec6977496218d62c28c6869522efb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yfonts-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
