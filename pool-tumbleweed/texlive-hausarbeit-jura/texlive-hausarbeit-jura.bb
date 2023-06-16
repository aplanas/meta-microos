SUMMARY = "Class for writing 'juristische Hausarbeiten' at German Universities"
DESCRIPTION = "The class was developed for use by students writing legal \
essays ('juristische Hausarbeit') at German Universities. It is \
based on jurabook and jurabib and makes it easy for LaTeX \
beginners to get a correct and nicely formatted paper."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.0svn56070"

RPM_NAME = "texlive-hausarbeit-jura-2023.201.2.1.0svn56070-53.1.noarch.rpm"
RPM_HASH = "563446b4a80f69247d962016daa57763c58c7283b7c42645454a723ab12baa158f1ad45a68bdb3a3102151eb51262834cd9dac39024b96bf4f7ddf67bf2297cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hausarbeit-jura.cls \
texlive-hausarbeit-jura"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-courier.sty \
tex-csquotes.sty \
tex-ellipsis.sty \
tex-eurosym.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-helvet.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-indentfirst.sty \
tex-inputenc.sty \
tex-jurabib.sty \
tex-jurabook.cls \
tex-mathptmx.sty \
tex-microtype.sty \
tex-textcomp.sty \
tex-tgcursor.sty \
tex-tgheros.sty \
tex-tgtermes.sty \
tex-varioref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
