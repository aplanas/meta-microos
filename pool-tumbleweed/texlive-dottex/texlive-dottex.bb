SUMMARY = "Use dot code in LaTeX"
DESCRIPTION = "The dottex package allows you to encapsulate 'dot' and 'neato' \
files in your document (dot and neato are both part of \
graphviz; dot creates directed graphs, neato undirected \
graphs). If you have shell-escape enabled, the package will \
arrange for your files to be processed at LaTeX time; \
otherwise, the conversion must be done manually as an \
intermediate process before a second LaTeX run."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.6svn15878"

RPM_NAME = "texlive-dottex-2023.209.0.0.6svn15878-53.1.noarch.rpm"
RPM_HASH = "3dd02c43fee437ebebc8ca97f806c937d597d8fad2f7133b7c796e7101bf31bc2aff589b3f4e70e240011f64568eccff43a0ea062157f165dcbe24dbf8c0c8f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dottex.sty \
texlive-dottex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-keyval.sty \
tex-moreverb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
