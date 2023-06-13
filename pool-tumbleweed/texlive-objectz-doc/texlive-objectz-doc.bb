SUMMARY = "Documentation for texlive-objectz"
DESCRIPTION = "This package includes the documentation for texlive-objectz"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn61719"

RPM_NAME = "texlive-objectz-doc-2023.201.svn61719-54.1.noarch.rpm"
RPM_HASH = "6bd94ccccb468d040fc4a67db440f68695b52e86b5af665c5cbac8ee529e0a16691e0342567531b4d4685d99eef039486372ba21ac9bf2560fad4174ec1e33a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-objectz-doc"

RDEPENDS:${PN} += ""

inherit rpm
