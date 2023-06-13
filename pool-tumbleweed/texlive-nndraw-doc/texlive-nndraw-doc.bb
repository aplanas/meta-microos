SUMMARY = "Documentation for texlive-nndraw"
DESCRIPTION = "This package includes the documentation for texlive-nndraw"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn59674"

RPM_NAME = "texlive-nndraw-doc-2023.201.1.0svn59674-54.1.noarch.rpm"
RPM_HASH = "be4b6f38f8388407aaedd235a6f1942a2c3de9625878e873b10fc8fb9f9c603f926bc6601862591b9e51abbb6cc596df12342e8dbd28d7e24fc2d19fd610984e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nndraw-doc"

RDEPENDS:${PN} += ""

inherit rpm
