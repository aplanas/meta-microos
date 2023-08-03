SUMMARY = "Documentation for texlive-babel-thai"
DESCRIPTION = "This package includes the documentation for texlive-babel-thai"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn30564"

RPM_NAME = "texlive-babel-thai-doc-2023.209.1.0.0svn30564-54.1.noarch.rpm"
RPM_HASH = "797969d3c90001a51a90ae770a51277ccfc25bdcadc680ee59c5eed7cdb302e90814ebcafd578cb0f78feccd4cc77891f9ef9d1e87a946e2c21a1c7e2f88ea7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-thai-doc"

RDEPENDS:${PN} += ""

inherit rpm
