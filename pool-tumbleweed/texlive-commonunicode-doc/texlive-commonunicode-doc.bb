SUMMARY = "Documentation for texlive-commonunicode"
DESCRIPTION = "This package includes the documentation for texlive-commonunicode"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.0svn62901"

RPM_NAME = "texlive-commonunicode-doc-2023.209.1.0.0svn62901-54.1.noarch.rpm"
RPM_HASH = "911a877b4f880ced5939fb7d063d7cb083d6de2741c4fa1dfe5c7ab0306ab7736dda3205ebb98b27b71c8ec571090cf362f34f64af41db5c1e4092f655b44487"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-commonunicode-doc"

RDEPENDS:${PN} += ""

inherit rpm
