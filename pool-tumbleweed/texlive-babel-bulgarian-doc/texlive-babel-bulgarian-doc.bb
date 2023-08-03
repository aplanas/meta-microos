SUMMARY = "Documentation for texlive-babel-bulgarian"
DESCRIPTION = "This package includes the documentation for texlive-babel-bulgarian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2gsvn31902"

RPM_NAME = "texlive-babel-bulgarian-doc-2023.209.1.2gsvn31902-54.1.noarch.rpm"
RPM_HASH = "41b3ff7f6b9507135d890d8d706d021acf4f32b9fbaed99281430d66981eae46b8be80874da0ab0b66d8dcae4e9f5a11f1e5b49888e0d88cc5b7924c0bc2f41b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-bulgarian-doc"

RDEPENDS:${PN} += ""

inherit rpm
