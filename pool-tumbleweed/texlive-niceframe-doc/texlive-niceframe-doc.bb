SUMMARY = "Documentation for texlive-niceframe"
DESCRIPTION = "This package includes the documentation for texlive-niceframe"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1csvn36086"

RPM_NAME = "texlive-niceframe-doc-2023.209.1.1csvn36086-55.1.noarch.rpm"
RPM_HASH = "4f17dea7d03122bce2f7a4597aea2206fd1051f4c22a4f54779d537467ffb4cbc03722c65ce884f6b11f5ebbc74d2bef861f23b284ea2a7cd07d419b6bc46cc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-niceframe-doc"

RDEPENDS:${PN} += ""

inherit rpm
