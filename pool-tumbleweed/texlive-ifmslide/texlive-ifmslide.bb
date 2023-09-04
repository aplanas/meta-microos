SUMMARY = "Presentation slides for screen and printouts"
DESCRIPTION = "This package is used to produce printed slides with LaTeX and \
online presentations with pdfLaTeX. It is provided by the \
'Institute of Mechanics' (ifm) Univ. of Technology Darmstadt, \
Germany. It is based on ideas of pdfslide, but completely \
rewritten for compatibility with texpower and seminar. The \
manual describes all functions and provides a sample."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.47svn20727"

RPM_NAME = "texlive-ifmslide-2023.209.0.0.47svn20727-54.1.noarch.rpm"
RPM_HASH = "0f571eca79f2d496d2630a29ad24a100304177a981014f89b406b8fcbd439fca35139f7e8dcda710fa62c8b00593526b24d63a73516e84dcca1c37ded89129d2"
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
