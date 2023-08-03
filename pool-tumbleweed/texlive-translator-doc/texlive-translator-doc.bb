SUMMARY = "Documentation for texlive-translator"
DESCRIPTION = "This package includes the documentation for texlive-translator"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.12dsvn59412"

RPM_NAME = "texlive-translator-doc-2023.209.1.12dsvn59412-53.1.noarch.rpm"
RPM_HASH = "f485c5cc7b2929b549d3bebc0480081c28bd2542cd94584d3ce043c79d2ae5bf774f20ceec5dd850f68407cf4b044323f66174dbee34afcad9786c0ada9ada13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-translator-doc"

RDEPENDS:${PN} += ""

inherit rpm
