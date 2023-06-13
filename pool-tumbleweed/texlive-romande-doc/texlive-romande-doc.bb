SUMMARY = "Documentation for texlive-romande"
DESCRIPTION = "This package includes the documentation for texlive-romande"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.008_v7_scsvn19537"

RPM_NAME = "texlive-romande-doc-2023.201.1.008_v7_scsvn19537-53.1.noarch.rpm"
RPM_HASH = "8ace57373e44a2872a512f7ebb89f6d2b159eb56c99d5a019f270344d31568b70a5d0baa0248c87fdd8389a34ed8ff824827930524c4c5bcd320421e8d727dd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-romande-doc"

RDEPENDS:${PN} += ""

inherit rpm
