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

PV = "2023.208.2.0svn52811"

RPM_NAME = "texlive-makerobust-2023.208.2.0svn52811-53.1.noarch.rpm"
RPM_HASH = "27962f69a99257de37e65d9f94d3ae5e2f4a8711f795fcb23e9d1d205a9395be6afde8c54ef66be412189b8037a2a3df56f3471a85eaaddaeac3378ed6d79553"
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
