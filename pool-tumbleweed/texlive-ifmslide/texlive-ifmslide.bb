SUMMARY = "Presentation slides for screen and printouts"
DESCRIPTION = "This package is used to produce printed slides with LaTeX and \
online presentations with pdfLaTeX. It is provided by the \
'Institute of Mechanics' (ifm) Univ. of Technology Darmstadt, \
Germany. It is based on ideas of pdfslide, but completely \
rewritten for compatibility with texpower and seminar. The \
manual describes all functions and provides a sample."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.47svn20727"

RPM_NAME = "texlive-ifmslide-2023.201.0.0.47svn20727-52.1.noarch.rpm"
RPM_HASH = "4ee9141bee1796fbcd61eb96ccb940723f0455ab7f4db5e0b5d237cefbec18880e436d5c2e4a578432a0f4dc2b6d311ed61d3319804cdb38d54b8942c963794c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ifmslide.cfg) \
tex(ifmslide.sty) \
texlive-ifmslide"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsbsy.sty) \
tex(amssymb.sty) \
tex(calc.sty) \
tex(color.sty) \
tex(fixseminar.sty) \
tex(graphicx.sty) \
tex(hyperref.sty) \
tex(ifpdf.sty) \
tex(ifthen.sty) \
tex(texpower.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
