SUMMARY = "Documentation for texlive-formal-grammar"
DESCRIPTION = "This package includes the documentation for texlive-formal-grammar"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn61955"

RPM_NAME = "texlive-formal-grammar-doc-2023.201.1.2svn61955-52.1.noarch.rpm"
RPM_HASH = "869a4a2bcf41497c8928ae9fd30132fd9eb4c9466e6737fa742820d15a445830e0a2d86684f9b62ee6ab0f2788ed4c9a53294c65e0670ebeb5381bfee82d3312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-formal-grammar-doc"

RDEPENDS:${PN} += ""

inherit rpm
