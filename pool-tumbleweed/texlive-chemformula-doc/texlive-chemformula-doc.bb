SUMMARY = "Documentation for texlive-chemformula"
DESCRIPTION = "This package includes the documentation for texlive-chemformula"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.17svn61719"

RPM_NAME = "texlive-chemformula-doc-2023.209.4.17svn61719-54.1.noarch.rpm"
RPM_HASH = "dc7a6b6bfe048f55618ebbe217345e0ab94b0c5c4e626002491b31aa02ea46ba5a965c03f9bd546dc3f7de48441bd46066066f460045c847b0842d166e0201e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemformula-doc"

RDEPENDS:${PN} += ""

inherit rpm
