SUMMARY = "Documentation for texlive-hershey-mp"
DESCRIPTION = "This package includes the documentation for texlive-hershey-mp"
LICENSE = "LPPL-1.0"

PV = "2023.209.2022_1.0svn64878"

RPM_NAME = "texlive-hershey-mp-doc-2023.209.2022_1.0svn64878-54.2.noarch.rpm"
RPM_HASH = "671268d8efc7c27ae8be36d8a7d3a2299fc924d5a440bc32d8ca25158b39679f6eafd6609cc7a5611cdda6f7291bd0f1e319a0d02f0c4388ed4a1279518527fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hershey-mp-doc"

RDEPENDS:${PN} += ""

inherit rpm
