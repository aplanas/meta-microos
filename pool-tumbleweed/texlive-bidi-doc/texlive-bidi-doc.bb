SUMMARY = "Documentation for texlive-bidi"
DESCRIPTION = "This package includes the documentation for texlive-bidi"
LICENSE = "LPPL-1.0"

PV = "2023.209.39.7svn65572"

RPM_NAME = "texlive-bidi-doc-2023.209.39.7svn65572-54.1.noarch.rpm"
RPM_HASH = "84252035afec23edbfdd4f25d5ca0c19bb87402c572efb18f50de836b8d1491a27a4976ef8fd9cff940ab83afa0c3a5e14b5706adfde1e0dd7f83a559a252ed0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bidi-doc"

RDEPENDS:${PN} += ""

inherit rpm
