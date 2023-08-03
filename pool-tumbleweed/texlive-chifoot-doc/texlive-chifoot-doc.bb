SUMMARY = "Documentation for texlive-chifoot"
DESCRIPTION = "This package includes the documentation for texlive-chifoot"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn57312"

RPM_NAME = "texlive-chifoot-doc-2023.209.1.0svn57312-54.1.noarch.rpm"
RPM_HASH = "c9ad2382d4f658d18e9016c28cc6d5d4fe747d3fab69a9ff60437c78cc940a1110f75ac95dff409699da9a01163599336414400e75dfc5f8c222399d8003a6e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chifoot-doc"

RDEPENDS:${PN} += ""

inherit rpm
