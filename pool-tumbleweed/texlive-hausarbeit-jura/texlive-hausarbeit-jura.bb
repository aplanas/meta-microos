SUMMARY = "Class for writing 'juristische Hausarbeiten' at German Universities"
DESCRIPTION = "The class was developed for use by students writing legal \
essays ('juristische Hausarbeit') at German Universities. It is \
based on jurabook and jurabib and makes it easy for LaTeX \
beginners to get a correct and nicely formatted paper."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.0svn56070"

RPM_NAME = "texlive-hausarbeit-jura-2023.209.2.1.0svn56070-54.2.noarch.rpm"
RPM_HASH = "21f92f471f510c3cdf54880f9f5ebbba1de725445b3901867bc0af3bae1de286c5acfdaf6ff14ce12c3510eccccf44d52a02732b9a429bcc105f25bb0c357fae"
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
