SUMMARY = "Typeset papers conforming to the stylesheet of the Cascadilla Proceedings Project"
DESCRIPTION = "The class provides an extension of the standard LaTeX article \
class that may be used to typeset papers conforming to the \
stylesheet of the Cascadilla Proceedings Project, which is used \
by a number of linguistics conference proceedings (e.g., \
WCCFL)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.8.2svn25144"

RPM_NAME = "texlive-cascadilla-2023.209.1.8.2svn25144-53.1.noarch.rpm"
RPM_HASH = "4315851ed449f20c8dbddbdfe46ad826e974b4dcc7aea582463736a39daa3af00427278c68c049107266da9c679a0ecc8b289cb92d09a4464f692b64408d1b26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cascadilla.cls \
texlive-cascadilla"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-caption.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-ifthen.sty \
tex-indentfirst.sty \
tex-natbib.sty \
tex-times.sty \
tex-titlesec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
