SUMMARY = "Documentation for texlive-naive-ebnf"
DESCRIPTION = "This package includes the documentation for texlive-naive-ebnf"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.5svn66017"

RPM_NAME = "texlive-naive-ebnf-doc-2023.209.0.0.0.5svn66017-55.1.noarch.rpm"
RPM_HASH = "19e294b98cc4001489d3a42d94c3f17abcf6cd830ff9c98b5152939151fcd29ead3e676f7f2896dedb5a0036f1c905d65659399bc0cd63d0edb54c8c702d6986"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-naive-ebnf-doc"

RDEPENDS:${PN} += ""

inherit rpm
