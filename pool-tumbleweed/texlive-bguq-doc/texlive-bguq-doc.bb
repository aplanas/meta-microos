SUMMARY = "Documentation for texlive-bguq"
DESCRIPTION = "This package includes the documentation for texlive-bguq"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn27401"

RPM_NAME = "texlive-bguq-doc-2023.201.0.0.4svn27401-53.1.noarch.rpm"
RPM_HASH = "89f970a108b7e237f66fc1e584aecf55405055fa5c02b6e1bb313218037f53c6b0ea65b44b7d98ddadd6f28745a1fd54cd2f38fca804dbd9f67b66d60640189a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bguq-doc"

RDEPENDS:${PN} += ""

inherit rpm
