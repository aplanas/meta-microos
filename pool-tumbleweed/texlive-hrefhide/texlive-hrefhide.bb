SUMMARY = "Suppress hyper links when printing"
DESCRIPTION = "This package provides the command \\hrefdisplayonly \
(additionally to \\href provided by the hyperref package). While \
the (hyperlinked) text appears like an ordinary \\href in the \
compiled pdf-file, the same text will be 'hidden' when printing \
the text. Hiding is actually achieved by making the text the \
same colour as the background, thus preserving the layout of \
the rest of the text. Further the commands \\hycon and \\hycoff \
(hyper-colour-on/off) can be used to simulate switching option \
ocgcolorlinks of the hyperref package on and off. This package \
is possibly obsolete, see section 3: 'Alternatives' in the \
documentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn66189"

RPM_NAME = "texlive-hrefhide-2023.209.1.1asvn66189-54.2.noarch.rpm"
RPM_HASH = "c21e41d3689590439191874450c8452703880df3dac54f07c2f8c15294a5bb3c5d145495877bee9ef880d0b75c4c42dc1a0b5516e83c940504bfbd1efc706abd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hrefhide.sty \
texlive-hrefhide"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
tex-kvoptions.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
