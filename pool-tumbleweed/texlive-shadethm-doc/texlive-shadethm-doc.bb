SUMMARY = "Documentation for texlive-shadethm"
DESCRIPTION = "This package includes the documentation for texlive-shadethm"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn53350"

RPM_NAME = "texlive-shadethm-doc-2023.209.svn53350-54.1.noarch.rpm"
RPM_HASH = "b85d5044b24d4cd141a141caef1f6d6b64033afa402c21c55bd47a709adc9d818570df51250ef11e4c3bb30ce0fc04d1e4f982f33f2fbcb23236bdee1039f495"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shadethm-doc"

RDEPENDS:${PN} += ""

inherit rpm
