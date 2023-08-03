SUMMARY = "Class for writing 'juristische Hausarbeiten' at German Universities"
DESCRIPTION = "The class was developed for use by students writing legal \
essays ('juristische Hausarbeit') at German Universities. It is \
based on jurabook and jurabib and makes it easy for LaTeX \
beginners to get a correct and nicely formatted paper."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.0svn56070"

RPM_NAME = "texlive-hausarbeit-jura-2023.209.2.1.0svn56070-54.1.noarch.rpm"
RPM_HASH = "9fb7b9d35ec1765208554b02ee63e370906c448ee453c8fd3c91559036138a6e8e09899b9117b6f5de1bc323e67e722fd631220b60dd50bd62110f54b4ad06fe"
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
