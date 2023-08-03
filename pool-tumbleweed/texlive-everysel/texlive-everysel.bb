SUMMARY = "Provides hooks into \\selectfont"
DESCRIPTION = "The package provided hooks whose arguments are executed just \
after LaTeX has loaded a new font by means of \\selectfont. It \
has become obsolete with LaTeX versions 2021/01/05 or newer, \
since LaTeX now provides its own hooks to fulfill this task. \
For newer versions of LaTeX everysel only provides macros using \
LaTeX's hook management due to compatibility reasons. See \
lthooks-doc.pdf for instructions how to use lthooks instead of \
everysel."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn57489"

RPM_NAME = "texlive-everysel-2023.209.2.1svn57489-53.1.noarch.rpm"
RPM_HASH = "862603f95fd82003133ca6e5faf62de9f1f4d9da296090605550429a76e6c4f17a1b5249952b9ca9cf0d6116b10ea25ae51bf1da4015623ae7d7f944bde58ae4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-everysel-2011-10-28.sty \
tex-everysel.sty \
texlive-everysel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
