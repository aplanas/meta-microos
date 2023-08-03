SUMMARY = "LaTeX class file for the Marathi journal 'Aalok'"
DESCRIPTION = "aalok mraatthii niytkaalikaacii akssrjulnnii krnnyaakritaa \
laattek-vrg. This package provides the class file for \
typesetting 'Aalok', a Marathi journal with LaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.6svn61719"

RPM_NAME = "texlive-aalok-2023.209.0.0.6svn61719-55.1.noarch.rpm"
RPM_HASH = "9968b6a585f2ee35389507de2a1cf29f36e760bced5d07f4abb809cb41075e52c7d43c465f2a6382748b64a2a4285832be74e2f8591f51a014eee81cc0a02f45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aalok.cls \
texlive-aalok"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-diagbox.sty \
tex-etoolbox.sty \
tex-expex.sty \
tex-expl3.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-fontawesome5.sty \
tex-graphicx.sty \
tex-marathi.sty \
tex-mdframed.sty \
tex-memoir.cls \
tex-microtype.sty \
tex-minitoc.sty \
tex-paracol.sty \
tex-tcolorbox.sty \
tex-tikz.sty \
tex-tocloft.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
