SUMMARY = "Documentation for texlive-br-lex"
DESCRIPTION = "This package includes the documentation for texlive-br-lex"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn44939"

RPM_NAME = "texlive-br-lex-doc-2023.209.svn44939-53.1.noarch.rpm"
RPM_HASH = "67511a4187901752c8fa4d0d3d9aa1940e60acc4f9d9749cc5f6bcfb52c99cd9215d552bfd8d5ce088708e6fb2b37186814a85db35f0e34cc47dbd1557241e4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-br-lex-doc-pt-BR \
texlive-br-lex-doc"

RDEPENDS:${PN} += ""

inherit rpm
