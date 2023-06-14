SUMMARY = "An Infrastructure for Semantic Preloading of LaTeX Documents"
DESCRIPTION = "The sTeX package collection is a version of TeX/LaTeX that \
allows to markup TeX/LaTeX documents semantically without \
leaving the document format, essentially turning it into a \
document format for mathematical knowledge management (MKM)."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.2.0svn64383"

RPM_NAME = "texlive-stex-2023.201.3.2.0svn64383-57.1.noarch.rpm"
RPM_HASH = "6fc9b27d2dc75923f9c375568fdda16f8d0517ff5fa85ede54ad245a6293705f4f3bd919435029ba7993d9381d044a7054f2cb9fe3ca8d88ce1630762e8bf501"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-beamerthemesTeX.sty \
tex-document-structure-ngerman.ldf \
tex-document-structure.sty \
tex-hwexam-finnish.ldf \
tex-hwexam-french.ldf \
tex-hwexam-ngerman.ldf \
tex-hwexam-russian.ldf \
tex-hwexam.sty \
tex-lststex.sty \
tex-notesslides.cls \
tex-notesslides.sty \
tex-problem-finnish.ldf \
tex-problem-french.ldf \
tex-problem-ngerman.ldf \
tex-problem-russian.ldf \
tex-problem.sty \
tex-rustex.sty \
tex-sproof-finnish.ldf \
tex-sproof-french.ldf \
tex-sproof-ngerman.ldf \
tex-sproof-russian.ldf \
tex-stex-backend-latexml.cfg \
tex-stex-backend-pdflatex.cfg \
tex-stex-backend-rustex.cfg \
tex-stex-backend-tex4ht.cfg \
tex-stex-logo.sty \
tex-stex-tikzinput.sty \
tex-stex.cls \
tex-stex.sty \
tex-stexthm.sty \
tex-tikzinput.sty \
texlive-stex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-a4wide.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-article.cls \
tex-babel.sty \
tex-beamer.cls \
tex-beamerarticle.sty \
tex-bookmark.sty \
tex-comment.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-keyval.sty \
tex-l3keys2e.sty \
tex-listings.sty \
tex-ltxcmds.sty \
tex-marginnote.sty \
tex-mdframed.sty \
tex-pdfcomment.sty \
tex-pgf.sty \
tex-standalone.cls \
tex-standalone.sty \
tex-thmtools.sty \
tex-tikz.sty \
tex-url.sty \
tex-xcolor.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
