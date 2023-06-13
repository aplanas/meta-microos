SUMMARY = "Documentation for texlive-qrcode"
DESCRIPTION = "This package includes the documentation for texlive-qrcode"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.51svn36065"

RPM_NAME = "texlive-qrcode-doc-2023.201.1.51svn36065-53.1.noarch.rpm"
RPM_HASH = "140896d55b77401dfbd5ed7b305a26a96f60360c67d43d8087a8ab30578fc8b4c24c337086f9b8536fa700d55a61e42231fed30abd0d314b4cfcb04abb854288"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qrcode-doc"

RDEPENDS:${PN} += ""

inherit rpm
