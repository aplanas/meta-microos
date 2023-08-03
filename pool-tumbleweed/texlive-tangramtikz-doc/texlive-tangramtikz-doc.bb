SUMMARY = "Documentation for texlive-tangramtikz"
DESCRIPTION = "This package includes the documentation for texlive-tangramtikz"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.5svn66183"

RPM_NAME = "texlive-tangramtikz-doc-2023.209.0.0.1.5svn66183-55.1.noarch.rpm"
RPM_HASH = "cf1e18b5e26028f0266b7d27c2b47af5cf1e1302ca5d989fa9e02ce05a99fa295ab58a76c9c6c14411e5569c3faaf481c8634a0054518fbf88d47b966a9f428b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tangramtikz-doc-fr \
texlive-tangramtikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
