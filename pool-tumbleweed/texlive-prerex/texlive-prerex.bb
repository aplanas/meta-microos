SUMMARY = "Interactive editor and macro support for prerequisite charts"
DESCRIPTION = "This package consists of prerex.sty, a LaTeX package for \
producing charts of course nodes linked by arrows representing \
pre- and co-requisites, and prerex, an interactive program for \
creating and editing chart descriptions. The implementation of \
prerex.sty uses PGF, so that it may be used equally happily \
with LaTeX or pdfLaTeX; prerex itself is written in C. The \
package includes source code for a previewer application, a \
lightweight Qt-4 and poppler-based prerex-enabled PDF viewer."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn54512"

RPM_NAME = "texlive-prerex-2023.209.svn54512-53.1.noarch.rpm"
RPM_HASH = "2ebda54cf14aba4c71dd0108d7f9f5ab1a2604ebe844553611808344d97c3ce89a0a9379fde30406c1edefd3c8e2291dea1f50a188ce0cde3d86f94786f12b2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-prerex.sty \
texlive-prerex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-hyperref.sty \
tex-pgf.sty \
tex-relsize.sty \
tex-textcomp.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
