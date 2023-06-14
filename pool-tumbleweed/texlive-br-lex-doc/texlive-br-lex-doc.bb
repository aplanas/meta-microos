SUMMARY = "Documentation for texlive-br-lex"
DESCRIPTION = "This package includes the documentation for texlive-br-lex"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn44939"

RPM_NAME = "texlive-br-lex-doc-2023.201.svn44939-52.1.noarch.rpm"
RPM_HASH = "af9865dc7b21b96e49848e1b4c8f7b964278f17e2aedbec2b44d20837ada6823afbc7e59370e08ed02916bc824a22b1c6d6693c5bfa8a98efa0d262d6dc90f79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-br-lex-doc-pt-BR \
texlive-br-lex-doc"

RDEPENDS:${PN} += ""

inherit rpm
