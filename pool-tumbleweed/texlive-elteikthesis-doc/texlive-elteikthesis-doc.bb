SUMMARY = "Documentation for texlive-elteikthesis"
DESCRIPTION = "This package includes the documentation for texlive-elteikthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn63186"

RPM_NAME = "texlive-elteikthesis-doc-2023.209.2.3svn63186-54.1.noarch.rpm"
RPM_HASH = "e0c3e63b4a4ff0ba505c99ea86819d733a69e5084e6cce547e2de943dfe098c20503247dd22e067bbb948b7bb0d444a2f71724b003b9d7aa6acc21b631e1b94c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-elteikthesis-doc-en;hu \
texlive-elteikthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
