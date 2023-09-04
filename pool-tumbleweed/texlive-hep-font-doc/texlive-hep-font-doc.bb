SUMMARY = "Documentation for texlive-hep-font"
DESCRIPTION = "This package includes the documentation for texlive-hep-font"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64900"

RPM_NAME = "texlive-hep-font-doc-2023.209.1.1svn64900-54.2.noarch.rpm"
RPM_HASH = "07404170e64850a39356d9cf42c3745419b155c873207f49765cdb37c4caab74015ac2cc658263d5da47d269741a77f866adc5d17fd1bd0255727b42a4dc4cf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-font-doc"

RDEPENDS:${PN} += ""

inherit rpm
