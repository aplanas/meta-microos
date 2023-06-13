SUMMARY = "Documentation for texlive-keyreader"
DESCRIPTION = "This package includes the documentation for texlive-keyreader"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5bsvn28195"

RPM_NAME = "texlive-keyreader-doc-2023.201.0.0.5bsvn28195-55.1.noarch.rpm"
RPM_HASH = "8f6dbcc62883e24c28c4bc986568df067d02760ca2683030d3d7aacfd50398e9d724b86d1ad2e748dcc2d93b8d2d4f59b7bb0bcc0916df39eeebfcffd020a735"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keyreader-doc"

RDEPENDS:${PN} += ""

inherit rpm
