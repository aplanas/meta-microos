SUMMARY = "Mathematics in accord with French usage"
DESCRIPTION = "The package provides settings and macros for typesetting \
mathematics with LaTeX in compliance with French usage. It \
comes with two document classes, 'fiche' and 'cours', useful to \
create short high school documents such as tests or lessons. \
The documentation is in French."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-mafr-2023.201.1.0svn15878-52.1.noarch.rpm"
RPM_HASH = "c27b471db6ab6b54cb079e391b72808a39abdfdd011d5297fc2f4c1df8c123cc7cd0635a015166f1e1e62a3c03859f9f6bb8447bde9b8d9e4c2a2e8d293538f3"
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
