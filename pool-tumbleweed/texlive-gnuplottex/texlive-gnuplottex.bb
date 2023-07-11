SUMMARY = "Embed Gnuplot commands in LaTeX documents"
DESCRIPTION = "This package allows you to include Gnuplot graphs in your LaTeX \
documents. The gnuplot code is extracted from the document and \
written to .gnuplot files. Then, if shell escape is used, the \
graph files are automatically processed to graphics or LaTeX \
code files which will then be included in the document. If \
shell escape isn't used, the user will have to manually convert \
the files by running gnuplot on the extracted .gnuplot files."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.9.5svn54758"

RPM_NAME = "texlive-gnuplottex-2023.201.0.0.9.5svn54758-53.2.noarch.rpm"
RPM_HASH = "8fad4ac246d8baddb4bb884a9298a47fbf6700e6301fc11862ea0c0d7f5172180196594b8541005a6be685f36632c1136ff1ea395cd649b15c5bb046ac42a360"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gnuplottex.sty \
texlive-gnuplottex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catchfile.sty \
tex-graphicx.sty \
tex-ifthen.sty \
tex-keyval.sty \
tex-moreverb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
