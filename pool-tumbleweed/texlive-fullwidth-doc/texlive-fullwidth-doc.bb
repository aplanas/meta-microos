SUMMARY = "Documentation for texlive-fullwidth"
DESCRIPTION = "This package includes the documentation for texlive-fullwidth"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn24684"

RPM_NAME = "texlive-fullwidth-doc-2023.209.0.0.1svn24684-53.1.noarch.rpm"
RPM_HASH = "8721ea8e24bca4f019857adab89266f8fbd15a9380d80c7f3faca10162680e723f6000f4fa65ddb2fa34ac66a4840343d0b1de2181d8fdf1c03d6941b9e7112d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fullwidth-doc"

RDEPENDS:${PN} += ""

inherit rpm
