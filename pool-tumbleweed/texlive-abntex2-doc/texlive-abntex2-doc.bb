SUMMARY = "Documentation for texlive-abntex2"
DESCRIPTION = "This package includes the documentation for texlive-abntex2"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9.7svn49248"

RPM_NAME = "texlive-abntex2-doc-2023.209.1.9.7svn49248-55.1.noarch.rpm"
RPM_HASH = "809f68f71aaffa13a166799c2f7991e09b4e6b8fcaf0be2c11d3000902848c844b6eccda28a5b94e67afea66d85981ccdb644b02a827ea7ff6dcf4b903a2160d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-abntex2-doc-pt-BR \
texlive-abntex2-doc"

RDEPENDS:${PN} += ""

inherit rpm
