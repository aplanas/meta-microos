SUMMARY = "A variation on the tabular environment"
DESCRIPTION = "The package offers a modification of the tabular environment, \
which deals with the problem of column heads that are \
significantly wider than the body of the column."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-tabularew-2023.201.0.0.1svn15878-54.1.noarch.rpm"
RPM_HASH = "7dde04eec68429e1885b6edd1b3e910d3978914202073891cb425a1d6e4fbb1bda020558f994df0a1aea30aa01535062d6dcebbc6fd580ea5c74a844be9da65f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tabularew.sty) \
texlive-tabularew"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(array.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
