SUMMARY = "Documentation for texlive-simurgh"
DESCRIPTION = "This package includes the documentation for texlive-simurgh"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.01bsvn31719"

RPM_NAME = "texlive-simurgh-doc-2023.201.0.0.01bsvn31719-57.1.noarch.rpm"
RPM_HASH = "715fb0491d3dec14cb9aea4c881747cf44ff049a710c4d30f24871f522e1f1f1110e75be0e868b3f37932ce153af927965ed8b77ddbfb5a3f005539b1b471528"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simurgh-doc"

RDEPENDS:${PN} += ""

inherit rpm
