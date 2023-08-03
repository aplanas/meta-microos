SUMMARY = "Documentation for texlive-babel-greek"
DESCRIPTION = "This package includes the documentation for texlive-babel-greek"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.12svn66346"

RPM_NAME = "texlive-babel-greek-doc-2023.209.1.12svn66346-54.1.noarch.rpm"
RPM_HASH = "5d915a29f8c99c65d86c6a4c2602d1d21a49069c04a4ee809dbffec17684103946f9487ed168ff3a1b43531612aababce5d0abadb92ef308fe4af0ff9efe84b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-greek-doc"

RDEPENDS:${PN} += ""

inherit rpm
