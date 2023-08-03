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

PV = "2023.209.2.4.3svn60874"

RPM_NAME = "texlive-latex-make-2023.209.2.4.3svn60874-56.1.noarch.rpm"
RPM_HASH = "79f9f235feeca3f9e54b30aaa47166d98474a95a7fff664718483306042738a6df60f4c2489cbaacbb2d4c6763fc90cc240c94b06992585209038ea025ac1571"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-figlatex.cfg \
tex-figlatex.sty \
tex-pdfswitch.sty \
tex-texdepends.sty \
tex-texgraphicx.sty \
texlive-latex-make"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
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
