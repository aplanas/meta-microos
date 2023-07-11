SUMMARY = "Documentation for texlive-xq"
DESCRIPTION = "This package includes the documentation for texlive-xq"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn35211"

RPM_NAME = "texlive-xq-doc-2023.201.0.0.4svn35211-52.2.noarch.rpm"
RPM_HASH = "8dd58ef2a018276412556137dbb41f5ea317dfc1737d8f2951a8c1586da7422cbe0161104dd192cf2e51fd9150cfd81af89f41f7fb2bcb25febec44ec9e5663c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xq-doc"

RDEPENDS:${PN} += ""

inherit rpm
