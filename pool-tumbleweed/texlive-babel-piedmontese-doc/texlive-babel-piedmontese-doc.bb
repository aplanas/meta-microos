SUMMARY = "Documentation for texlive-babel-piedmontese"
DESCRIPTION = "This package includes the documentation for texlive-babel-piedmontese"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn30282"

RPM_NAME = "texlive-babel-piedmontese-doc-2023.201.1.0svn30282-53.1.noarch.rpm"
RPM_HASH = "a248bf4ccac682bc6e3250ec8058b624c97adf6000bc3272acd47afe457494341d1f80de818b4252dd745f3c8c6e119144844f5526647546e10093b2af508d8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-piedmontese-doc"

RDEPENDS:${PN} += ""

inherit rpm
