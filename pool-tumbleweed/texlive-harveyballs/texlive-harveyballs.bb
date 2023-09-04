SUMMARY = "Create Harvey Balls using TikZ"
DESCRIPTION = "The package provides 5 commands (giving symbols that indicate \
values from 'none' to 'full')."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn32003"

RPM_NAME = "texlive-harveyballs-2023.209.1.1svn32003-54.2.noarch.rpm"
RPM_HASH = "b42dd375bd5e09edb910514a2965f280953137fc3c7ad17f85fc4f53e800e774a8a67dee1679b411f49a397987b34b7e91219a6831176893d403439bab06e668"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-harveyballs.sty \
texlive-harveyballs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
