SUMMARY = "Documentation for texlive-zitie"
DESCRIPTION = "This package includes the documentation for texlive-zitie"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4.0svn60676"

RPM_NAME = "texlive-zitie-doc-2023.201.1.4.0svn60676-52.2.noarch.rpm"
RPM_HASH = "be699060e55ee62794b3297fe8ef13824061b9add8a28ad29d3f74a2256f5ab11a685a4b6b2de8ab855d858ab5b1fec025c6f3a95fc0106b1223840502c43ec3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-zitie-doc-zh \
texlive-zitie-doc"

RDEPENDS:${PN} += ""

inherit rpm
