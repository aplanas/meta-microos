SUMMARY = "Documentation for texlive-calligra"
DESCRIPTION = "This package includes the documentation for texlive-calligra"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-calligra-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "40f7cb6f800665fae8a6906b8833b4aa04d23bc153c40d9eacb03ba2de6c82e3efd87982e81581334851455d133eec8d3bba8a4b114770f20d9bb2b721dd40ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calligra-doc"

RDEPENDS:${PN} += ""

inherit rpm
