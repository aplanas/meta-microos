SUMMARY = "Documentation for texlive-pst-uml"
DESCRIPTION = "This package includes the documentation for texlive-pst-uml"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.83svn15878"

RPM_NAME = "texlive-pst-uml-doc-2023.209.0.0.83svn15878-54.2.noarch.rpm"
RPM_HASH = "809e872919ce2bca820444d78ab5744ed7812092f4cfff3fbb79fbc207923083c24a4b5730fdc400bc065cfd4bff1722dcc25e6cbdfbc9db33f6108a101f6262"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-uml-doc-fr \
texlive-pst-uml-doc"

RDEPENDS:${PN} += ""

inherit rpm
