SUMMARY = "Documentation for texlive-pst-osci"
DESCRIPTION = "This package includes the documentation for texlive-pst-osci"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.82svn15878"

RPM_NAME = "texlive-pst-osci-doc-2023.209.2.82svn15878-53.1.noarch.rpm"
RPM_HASH = "1ca5a18359aeb27567f9d51a670f985abf0076202b9db2da0c288c6bb6536b3cc012e1324236acf571b4c0d99d7aafdb7076b10b8d788bbf17bc31905d489848"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-osci-doc-fr;en \
texlive-pst-osci-doc"

RDEPENDS:${PN} += ""

inherit rpm
