SUMMARY = "Documentation for texlive-yathesis"
DESCRIPTION = "This package includes the documentation for texlive-yathesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.11svn66146"

RPM_NAME = "texlive-yathesis-doc-2023.201.1.0.11svn66146-52.2.noarch.rpm"
RPM_HASH = "4221429e73e80b71b1ffeace13556b23212fe1e14889ede5779ba7ceec7fee056fb0158709cb9e21f482d0e9569469b6da2be971f17282c43a6075b75e3e51bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-yathesis-doc-fr \
texlive-yathesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
