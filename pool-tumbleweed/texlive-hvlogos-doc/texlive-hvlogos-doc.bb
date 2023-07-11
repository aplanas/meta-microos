SUMMARY = "Documentation for texlive-hvlogos"
DESCRIPTION = "This package includes the documentation for texlive-hvlogos"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.09svn63261"

RPM_NAME = "texlive-hvlogos-doc-2023.208.0.0.09svn63261-53.1.noarch.rpm"
RPM_HASH = "f275c125b26dd482d3c6cda592c44a4384d16efe9747d99fa85f93cf983ec35de5468f0538271f2cb30326dd228c291402a3fa21329f03b1c889ea86b3365fcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hvlogos-doc"

RDEPENDS:${PN} += ""

inherit rpm
