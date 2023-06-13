SUMMARY = "Documentation for texlive-skaknew"
DESCRIPTION = "This package includes the documentation for texlive-skaknew"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20031"

RPM_NAME = "texlive-skaknew-doc-2023.201.svn20031-57.1.noarch.rpm"
RPM_HASH = "f9db24701f995048f240be3cf47bd214859dd448f2f67b3809f3a9caeee6ddbd6b6a45e421ab32da3d9a03b831b28b81b102f36696d2946975ea223d5b5845b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skaknew-doc"

RDEPENDS:${PN} += ""

inherit rpm
