SUMMARY = "Mathematics in accord with French usage"
DESCRIPTION = "The package provides settings and macros for typesetting \
mathematics with LaTeX in compliance with French usage. It \
comes with two document classes, 'fiche' and 'cours', useful to \
create short high school documents such as tests or lessons. \
The documentation is in French."
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.1.0svn15878"

RPM_NAME = "texlive-mafr-2023.208.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "8889d5e461b56d249036b96099fb0d53de9fc016fc5d3c3b0ae60f8fd527abbddebf97a0e844f573ee029bf2a1b41e7b4c94d1fbf28b29d3f8608d14ba20037f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cours.cls \
tex-fiche.cls \
tex-mafr.sty \
texlive-mafr"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-a4wide.sty \
tex-article.cls \
tex-babel.sty \
tex-fontenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
