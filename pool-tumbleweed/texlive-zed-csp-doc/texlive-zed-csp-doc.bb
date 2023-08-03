SUMMARY = "Documentation for texlive-zed-csp"
DESCRIPTION = "This package includes the documentation for texlive-zed-csp"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17258"

RPM_NAME = "texlive-zed-csp-doc-2023.209.svn17258-53.1.noarch.rpm"
RPM_HASH = "b8cd345565069b0c3a2fb77bb98c97f377953ef891af7685dd504d0e85081013ea07d5b89d7a96a5f2da7d996a9978445a47072ae7a4847f453149eea11fdf33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zed-csp-doc"

RDEPENDS:${PN} += ""

inherit rpm
