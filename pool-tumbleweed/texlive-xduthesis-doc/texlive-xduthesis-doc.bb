SUMMARY = "Documentation for texlive-xduthesis"
DESCRIPTION = "This package includes the documentation for texlive-xduthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.00svn63116"

RPM_NAME = "texlive-xduthesis-doc-2023.201.1.00svn63116-52.1.noarch.rpm"
RPM_HASH = "502e604dad3acb46245af1d385b27f94a48fabb20f862a5705f14019b4248b1be77539c342a9fdd3f001e828d1d7ff4da7a1666b125eca6a6ddc1db36d10c547"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xduthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
