SUMMARY = "Documentation for texlive-huawei"
DESCRIPTION = "This package includes the documentation for texlive-huawei"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.15.0svn65264"

RPM_NAME = "texlive-huawei-doc-2023.208.0.0.15.0svn65264-53.1.noarch.rpm"
RPM_HASH = "b2a7862d61625dce38b90fd732267ca2e0543b0c8c213e9c5fc36d2fed24b330bdf0a19ca62c744cbffc233db52376d1347e7c2a8626da86593deb8147b3a6eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-huawei-doc"

RDEPENDS:${PN} += ""

inherit rpm
