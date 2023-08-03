SUMMARY = "Flexible typesetting of Curricula Vitae"
DESCRIPTION = "The package provides the framework for typesetting a Curriculum \
Vitae (composed in French), together with a number of 'themes' \
that may be used with the package. (The use of the themes may \
be seen in the package's examples/ collection.) The author \
hints that conversion for use with other languages (than \
French) should be possible."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.01svn32263"

RPM_NAME = "texlive-pas-cv-2023.209.2.01svn32263-52.1.noarch.rpm"
RPM_HASH = "c715b408e53f59df6902c54a625a1f590ed61513960dfd10629897447eca390d27d13ce2960935e2c9c43bc8b756e5938891524a8f6d0520d0bb6d48b0c3c50e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-macro-andromede.tex \
tex-macro-architecte.tex \
tex-macro-centaure.tex \
tex-macro-dynamique.tex \
tex-macro-gaia.tex \
tex-macro-jupiter.tex \
tex-macro-mars.tex \
tex-macro-neptune.tex \
tex-macro-orion.tex \
tex-macro-pegase.tex \
tex-macro-pluton.tex \
tex-macro-saturne.tex \
tex-macro-univers.tex \
tex-macro-uranus.tex \
tex-macro-venus.tex \
tex-pas-cv.sty \
texlive-pas-cv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eso-pic.sty \
tex-fp.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
