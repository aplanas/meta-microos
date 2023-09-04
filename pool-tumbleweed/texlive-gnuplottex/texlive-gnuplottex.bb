SUMMARY = "Embed Gnuplot commands in LaTeX documents"
DESCRIPTION = "This package allows you to include Gnuplot graphs in your LaTeX \
documents. The gnuplot code is extracted from the document and \
written to .gnuplot files. Then, if shell escape is used, the \
graph files are automatically processed to graphics or LaTeX \
code files which will then be included in the document. If \
shell escape isn't used, the user will have to manually convert \
the files by running gnuplot on the extracted .gnuplot files."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.9.5svn54758"

RPM_NAME = "texlive-gnuplottex-2023.209.0.0.9.5svn54758-54.2.noarch.rpm"
RPM_HASH = "d152d6c8b1bd5cf0bae654c0b5a1da073758ff9eb4670f300c312971f9ea670a709b06fe2eda22073e39ff2ad394d678ba40b346b424cc964ea0c26b94e5bd73"
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
