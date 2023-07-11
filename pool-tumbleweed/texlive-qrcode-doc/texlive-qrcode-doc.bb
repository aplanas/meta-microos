SUMMARY = "Documentation for texlive-qrcode"
DESCRIPTION = "This package includes the documentation for texlive-qrcode"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.51svn36065"

RPM_NAME = "texlive-qrcode-doc-2023.201.1.51svn36065-53.2.noarch.rpm"
RPM_HASH = "f8eff87cc9bfb13b078c8dd4de855b15e655e4a2a1413d0be4cbd153492fd215c66b7c07d0d63e34fa075d12ec495dab9a768b7189b90cd87d8fb75c3a75e8c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qrcode-doc"

RDEPENDS:${PN} += ""

inherit rpm
