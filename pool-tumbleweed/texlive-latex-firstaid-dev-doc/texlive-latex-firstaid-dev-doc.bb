SUMMARY = "Documentation for texlive-latex-firstaid-dev"
DESCRIPTION = "This package includes the documentation for texlive-latex-firstaid-dev"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0wsvn65181"

RPM_NAME = "texlive-latex-firstaid-dev-doc-2023.209.1.0wsvn65181-56.1.noarch.rpm"
RPM_HASH = "adfedb9df61b4d9527af9ce4310a5bdfa93b331951f2149f17e718c88e0bd95d1d84c46294056f137830d4a305087c03e62f310a29b0a0e6e42b685728c43bc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-firstaid-dev-doc"

RDEPENDS:${PN} += ""

inherit rpm
