SUMMARY = "LaTeX class file for the Marathi journal 'Aalok'"
DESCRIPTION = "aalok mraatthii niytkaalikaacii akssrjulnnii krnnyaakritaa \
laattek-vrg. This package provides the class file for \
typesetting 'Aalok', a Marathi journal with LaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.6svn61719"

RPM_NAME = "texlive-aalok-2023.201.0.0.6svn61719-54.1.noarch.rpm"
RPM_HASH = "b6c6dae24e36a967a01876d5e196a5c9e6a8814e2aeab4c864faeb3c950e2e176e825a6ef0f62a547da59cef750f8d399d399daedfb9671d568dd99930e4230d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(aalok.cls) \
texlive-aalok"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(article.cls) \
tex(diagbox.sty) \
tex(etoolbox.sty) \
tex(expex.sty) \
tex(expl3.sty) \
tex(fancyhdr.sty) \
tex(float.sty) \
tex(fontawesome5.sty) \
tex(graphicx.sty) \
tex(marathi.sty) \
tex(mdframed.sty) \
tex(memoir.cls) \
tex(microtype.sty) \
tex(minitoc.sty) \
tex(paracol.sty) \
tex(tcolorbox.sty) \
tex(tikz.sty) \
tex(tocloft.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
