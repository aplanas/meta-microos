SUMMARY = "A class for undergraduate theses at the University of Athens"
DESCRIPTION = "The class conforms to the requirements of the Department of \
Informatics and Telecommunications at the University of Athens \
regarding the preparation of undergraduate theses, as of Sep 1, \
2011. The class is designed for use with XeLaTeX; by default \
(on a Windows platform), the font Arial is used, but provision \
is made for use under Linux (with a different sans-serif font)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn34295"

RPM_NAME = "texlive-dithesis-2023.201.0.0.2svn34295-52.1.noarch.rpm"
RPM_HASH = "9a68bd59ce7f0ffce16a87bfecbfed863a71fb2348decdd1fb81ce2d061767f2479aaf278d62ccdcdb6da593a2ff8407c361d9e1ccc6ddb788e6e4ffc702c225"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dithesis.cls \
texlive-dithesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-fancyhdr.sty \
tex-float.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-parskip.sty \
tex-setspace.sty \
tex-subfig.sty \
tex-tabularx.sty \
tex-titlesec.sty \
tex-titletoc.sty \
tex-titling.sty \
tex-tocloft.sty \
tex-xifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
