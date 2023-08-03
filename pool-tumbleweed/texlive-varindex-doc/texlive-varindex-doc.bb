SUMMARY = "Documentation for texlive-varindex"
DESCRIPTION = "This package includes the documentation for texlive-varindex"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn32262"

RPM_NAME = "texlive-varindex-doc-2023.209.2.3svn32262-54.1.noarch.rpm"
RPM_HASH = "407ddb09775f9c76ba6f35ff12d91dbf4dec2cbccb59f3fe3d17a464bc3660378239e86cfc28b696c06bebe75a99be3ea4b58f7b25c5a9deafd33bb2d2bf3392"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-varindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
