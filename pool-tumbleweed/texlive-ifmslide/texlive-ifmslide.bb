SUMMARY = "Presentation slides for screen and printouts"
DESCRIPTION = "This package is used to produce printed slides with LaTeX and \
online presentations with pdfLaTeX. It is provided by the \
'Institute of Mechanics' (ifm) Univ. of Technology Darmstadt, \
Germany. It is based on ideas of pdfslide, but completely \
rewritten for compatibility with texpower and seminar. The \
manual describes all functions and provides a sample."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.47svn20727"

RPM_NAME = "texlive-ifmslide-2023.208.0.0.47svn20727-53.1.noarch.rpm"
RPM_HASH = "0ba74fd9fa01df65f3d41996f7830fde63053e7df04b6ee6a2bccc6f532f2ad2ca679d0759d63d384b476d1a43e978643bf071747cb27cb87382b3065315ed25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifmslide.cfg \
tex-ifmslide.sty \
texlive-ifmslide"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsbsy.sty \
tex-amssymb.sty \
tex-calc.sty \
tex-color.sty \
tex-fixseminar.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-texpower.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
