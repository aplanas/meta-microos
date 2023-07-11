SUMMARY = "IMTEK thesis class"
DESCRIPTION = "The class permits typesetting of diploma, bachelor's and \
master's theses for the Institute of Microsystem Technology \
(IMTEK) at the University of Freiburg (Germany). The class is \
based on the KOMA-Script class scrbook. Included in the \
documentation is a large collection of useful tips for \
typesetting theses and a list of recommended packages."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.7svn17667"

RPM_NAME = "texlive-imtekda-2023.208.1.7svn17667-53.1.noarch.rpm"
RPM_HASH = "8bf9f9f67ad39d5815dbb079b9340256258ed4e61fbc9b75a05a410ba7d387f55b31de15d96e160679a407b12c24b0e216c3cf117838e6088ecb49bc7efb8559"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-IMTEKda.cls \
texlive-imtekda"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphicx.sty \
tex-scrbook.cls \
tex-textpos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
