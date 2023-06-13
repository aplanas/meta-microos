SUMMARY = "Use dot code in LaTeX"
DESCRIPTION = "The dottex package allows you to encapsulate 'dot' and 'neato' \
files in your document (dot and neato are both part of \
graphviz; dot creates directed graphs, neato undirected \
graphs). If you have shell-escape enabled, the package will \
arrange for your files to be processed at LaTeX time; \
otherwise, the conversion must be done manually as an \
intermediate process before a second LaTeX run."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.6svn15878"

RPM_NAME = "texlive-dottex-2023.201.0.0.6svn15878-52.1.noarch.rpm"
RPM_HASH = "947175df6c210db211c247eb8345c10f018a848c62698d0c8d854f90d8821adc189186c6870e8b68606d8f7fd9f112ed7d67bf5b9ce0dd66214c0d6462c2ff34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dottex.sty) \
texlive-dottex"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(graphicx.sty) \
tex(keyval.sty) \
tex(moreverb.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
