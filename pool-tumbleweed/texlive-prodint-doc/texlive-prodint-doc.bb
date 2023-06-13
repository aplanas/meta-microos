SUMMARY = "Documentation for texlive-prodint"
DESCRIPTION = "This package includes the documentation for texlive-prodint"
LICENSE = "OFL-1.1"

PV = "2023.201.svn21893"

RPM_NAME = "texlive-prodint-doc-2023.201.svn21893-52.1.noarch.rpm"
RPM_HASH = "2c325ac54c6890c960e82afe4be1751f553b6096b8efcb2d4da06ddf56ef4dbc4a29ec61f8d6c5a4387708e33a6ac7d8536186b63fa3df1166efa5d976697ef8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prodint-doc"

RDEPENDS:${PN} += ""

inherit rpm
