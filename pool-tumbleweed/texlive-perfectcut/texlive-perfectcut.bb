SUMMARY = "Nested delimiters that consistently grow regardless of the contents"
DESCRIPTION = "This package defines the command \\perfectcut#1#2 which displays \
a bracket <#1||#2>. Various other delimiters are similarly \
defined (parentheses, square brackets ...). The effect of these \
commands is to let the delimiters grow according to the number \
of nested \\perfectcommands (regardless of the size of the \
contents). The package was originally intended for solving a \
notational issue for direct-style continuation calculi in proof \
theory. For general use, the package also defines commands for \
defining other sorts of delimiters which will behave in the \
same way (see example in the documentation). The package also \
offers a robust reimplementation of \\big, \\bigg, etc."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn54080"

RPM_NAME = "texlive-perfectcut-2023.209.2.3svn54080-52.1.noarch.rpm"
RPM_HASH = "c44b72ed0dcb7752e1b31d1d7daabec34f29fbc670c301a3bbdb0bf06d34129597af3d30718ec95c9db63c2a6f70fc9aaf6354c33398eaccc10086e586bea148"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-perfectcut.sty \
texlive-perfectcut"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-graphicx.sty \
tex-mathstyle.sty \
tex-scalerel.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
