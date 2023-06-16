SUMMARY = "Making a macro robust (legacy package)"
DESCRIPTION = "Heiko Oberdiek's makerobust package defined a command with name \
\\MakeRobustCommand that could be used to make fragile commands \
robust. The LaTeX format has, since 2015, included a command \
\\MakeRobust with the same syntax and behaviour. Also by 2019, \
almost all commands in LaTeX that may be used in a moving \
argument are already robust. This package is now just a simple \
one-liner defining the name \\MakeRobustCommand as an alias for \
\\MakeRobust. This package should not be used in any new \
documents."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn52811"

RPM_NAME = "texlive-makerobust-2023.201.2.0svn52811-52.1.noarch.rpm"
RPM_HASH = "57629d13820306338369d8780b74e3f180397d61cfaa15138be5057a70cb92e122cbdbecae705bfb724cd247ab6378ac3fd85bbfc33262197b24f749a3f33be7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-makerobust.sty \
texlive-makerobust"

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
