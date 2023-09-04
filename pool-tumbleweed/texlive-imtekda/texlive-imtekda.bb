SUMMARY = "IMTEK thesis class"
DESCRIPTION = "The class permits typesetting of diploma, bachelor's and \
master's theses for the Institute of Microsystem Technology \
(IMTEK) at the University of Freiburg (Germany). The class is \
based on the KOMA-Script class scrbook. Included in the \
documentation is a large collection of useful tips for \
typesetting theses and a list of recommended packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn17667"

RPM_NAME = "texlive-imtekda-2023.209.1.7svn17667-54.1.noarch.rpm"
RPM_HASH = "4b2ecbceedc09d60b54f59e0c148c6bcaefce343d5af895d5f80e57308bbfd32ee9e03c80cd6c55e425ca997f5189f256f17219acf3bbb7599a7cc14e2136ae6"
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
