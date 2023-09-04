SUMMARY = "Documentation for texlive-reotex"
DESCRIPTION = "This package includes the documentation for texlive-reotex"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn34924"

RPM_NAME = "texlive-reotex-doc-2023.209.1.1svn34924-54.2.noarch.rpm"
RPM_HASH = "f74114efc50a90d241631b3ed58e53083c42f997979b0ae0cddcb5bcdd45d7e728b30c694a1ab7a300ddd1b2af8372c7cfc2ae95f6012598be80d9621608e883"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-reotex-doc"

RDEPENDS:${PN} += ""

inherit rpm
