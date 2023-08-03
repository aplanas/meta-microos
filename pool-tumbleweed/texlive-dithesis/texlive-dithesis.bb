SUMMARY = "A class for undergraduate theses at the University of Athens"
DESCRIPTION = "The class conforms to the requirements of the Department of \
Informatics and Telecommunications at the University of Athens \
regarding the preparation of undergraduate theses, as of Sep 1, \
2011. The class is designed for use with XeLaTeX; by default \
(on a Windows platform), the font Arial is used, but provision \
is made for use under Linux (with a different sans-serif font)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn34295"

RPM_NAME = "texlive-dithesis-2023.209.0.0.2svn34295-53.1.noarch.rpm"
RPM_HASH = "2a85af65c7a174d2defc526db884194ac8f49141e351607dfa7e4f5e747d35f6af5aee0d37f24eaa93b85401f51f9ad22aa9f0c16f0bf04a09af1c0cfc66f925"
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
