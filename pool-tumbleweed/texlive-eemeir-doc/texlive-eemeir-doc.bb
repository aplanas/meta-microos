SUMMARY = "Documentation for texlive-eemeir"
DESCRIPTION = "This package includes the documentation for texlive-eemeir"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1bsvn15878"

RPM_NAME = "texlive-eemeir-doc-2023.209.1.1bsvn15878-54.2.noarch.rpm"
RPM_HASH = "18bc2e7507835a3622eca154851fbb3ee86336173487a01afdf8ccf38b62ac2b147f823a9ad3ebbd3cbdbbc64318b706f2c325db4d5a71ae4bcacdcf9f2771c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eemeir-doc"

RDEPENDS:${PN} += ""

inherit rpm
