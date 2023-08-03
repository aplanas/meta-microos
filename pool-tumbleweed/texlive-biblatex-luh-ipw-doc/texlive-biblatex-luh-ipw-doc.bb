SUMMARY = "Documentation for texlive-biblatex-luh-ipw"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-luh-ipw"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn32180"

RPM_NAME = "texlive-biblatex-luh-ipw-doc-2023.209.0.0.3svn32180-54.1.noarch.rpm"
RPM_HASH = "dced5448519c54311ecf07c4a6ae1a89b254f1ebd6449b69345c47e295937c89cf2c33ba2e59be5749d54cf93df7640e57a67bae7ddc913d5d633ff73a8d6695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-luh-ipw-doc-de \
texlive-biblatex-luh-ipw-doc"

RDEPENDS:${PN} += ""

inherit rpm
