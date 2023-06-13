SUMMARY = "Documentation for texlive-sesamanuel"
DESCRIPTION = "This package includes the documentation for texlive-sesamanuel"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn36613"

RPM_NAME = "texlive-sesamanuel-doc-2023.201.0.0.6svn36613-53.1.noarch.rpm"
RPM_HASH = "1b7dc612c6a7320d475c543224b7c80b40b5f792e75e97265e52581dc59bb977cabacb0ca582c886ec401ab0dae6d4283eb40da31a233cc7f701b6277247855e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-sesamanuel-doc:fr) \
texlive-sesamanuel-doc"

RDEPENDS:${PN} += ""

inherit rpm
