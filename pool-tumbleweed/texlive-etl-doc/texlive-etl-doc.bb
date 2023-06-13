SUMMARY = "Documentation for texlive-etl"
DESCRIPTION = "This package includes the documentation for texlive-etl"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn60998"

RPM_NAME = "texlive-etl-doc-2023.201.0.0.3svn60998-52.1.noarch.rpm"
RPM_HASH = "9e44a70fb41866a0cc57c5b72dea391b37e2c946530e8564c11fed933d3072113e01768232deb2e400edad9bdfbc0f78d83cbc7e80ab8cd40e121fdc85eec4b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etl-doc"

RDEPENDS:${PN} += ""

inherit rpm
