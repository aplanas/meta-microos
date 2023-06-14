SUMMARY = "Easy compiling of complex (and simple) LaTeX documents"
DESCRIPTION = "This package provides several tools that aim to simplify the \
compilation of LaTeX documents: LaTeX.mk: a Makefile snippet to \
help compiling LaTeX documents in DVI, PDF, PS, ... format. \
Dependencies are automatically tracked: one should be able to \
compile documents with a one-line Makefile containing 'include \
LaTeX.mk'. Complex documents (with multiple bibliographies, \
indexes, glossaries, ...) should be correctly managed. \
figlatex.sty: a LaTeX package to easily insert xfig figures \
(with \\includegraphics{file.fig}). It can interact with \
LaTeX.mk so that the latter automatically invokes transfig if \
needed. And various helper tools for LaTeX.mk This package \
requires GNUmake (>= 3.81)."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.4.3svn60874"

RPM_NAME = "texlive-latex-make-2023.201.2.4.3svn60874-55.1.noarch.rpm"
RPM_HASH = "6f7c883887e4921c45cef7f387571728aeb7958006777d8ff3f03fe6a9ab8e6a7a164ac6ea97cf6ce76e3e226c03f1ef3fc606892770130f2662981a897d5000"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-figlatex.cfg \
tex-figlatex.sty \
tex-pdfswitch.sty \
tex-texdepends.sty \
tex-texgraphicx.sty \
texlive-latex-make"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
coreutils \
ed \
findutils \
grep \
sed \
tex-ae.sty \
tex-aeguill.sty \
tex-color.sty \
tex-epstopdf.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-thumbpdf.sty \
tex-xcolor.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
