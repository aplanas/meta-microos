SUMMARY = "Documentation for texlive-hep-float"
DESCRIPTION = "This package includes the documentation for texlive-hep-float"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64904"

RPM_NAME = "texlive-hep-float-doc-2023.201.1.1svn64904-53.2.noarch.rpm"
RPM_HASH = "a5d02ac1b127d29b5f613f0eb11c80c186f20ba8c319a5a586be2cd5eb04ddef67a328c8d76a65143f06e802fee99841afb5257c9cefe4036f3113d0e0710a0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-float-doc"

RDEPENDS:${PN} += ""

inherit rpm
