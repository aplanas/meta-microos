SUMMARY = "Create tagged and structured PDF files"
DESCRIPTION = "The accessibility package is intended to create tagged, \
structured PDF documents from LaTeX source code. It allows to \
produce tagged PDF output following Adobe's PDF-1.5 and 1.6 \
specifications. This package is predominantly targeted at \
documents produced using the KOMA-Script document classes. \
However, the author told us towards the end of June 2020: \
'Based on feedback to the 'accessibility' package and \
discussions with a few folks, I'd like to discourage people \
from using the package any more. It's evident that it's not \
going to work in it's current form, and I don't have the skills \
or time to update it. I know the general concept is very \
important, and so I'm looking at getting support from various \
funding agencies to employ someone to completely refactor the \
code in a more future-proof fashion. I'll coordinate this with \
the core LaTeX Team once I have more solid ideas.'"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.3svn55777"

RPM_NAME = "texlive-accessibility-2023.209.2.0.3svn55777-55.1.noarch.rpm"
RPM_HASH = "32d2b9917294d0c2931f810c2431abe240e25b571f3a13ded4514de0c8e9ea394f9707a0232ca42aededbf822cc0acf2c94c01c94ac24ab10cbbbd4a1333078a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-accessibility.sty \
texlive-accessibility"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
