SUMMARY = "Documentation for texlive-xduthesis"
DESCRIPTION = "This package includes the documentation for texlive-xduthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.00svn63116"

RPM_NAME = "texlive-xduthesis-doc-2023.201.1.00svn63116-52.2.noarch.rpm"
RPM_HASH = "f8a8fbb1a34e6b65ce291d9974db8ed0f47859a76d8130be375583bf0c7540a07222eef7621d7917c7beabc16bfd63c5da361c39a2f03751d35327c9444227af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xduthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
