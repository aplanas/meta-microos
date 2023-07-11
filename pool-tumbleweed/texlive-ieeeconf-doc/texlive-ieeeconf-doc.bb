SUMMARY = "Documentation for texlive-ieeeconf"
DESCRIPTION = "This package includes the documentation for texlive-ieeeconf"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.4svn59665"

RPM_NAME = "texlive-ieeeconf-doc-2023.208.1.4svn59665-53.1.noarch.rpm"
RPM_HASH = "2c52ced9ef34e4c00b2833a9e1544553b2f58c9d23b480f524f3ede8fe6e649614add155b949f5cdb01b6c208557915c5dd72a61176f10c84b5ab87823718618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ieeeconf-doc"

RDEPENDS:${PN} += ""

inherit rpm
