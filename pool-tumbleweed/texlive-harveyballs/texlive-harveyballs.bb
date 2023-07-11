SUMMARY = "Create Harvey Balls using TikZ"
DESCRIPTION = "The package provides 5 commands (giving symbols that indicate \
values from 'none' to 'full')."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn32003"

RPM_NAME = "texlive-harveyballs-2023.201.1.1svn32003-53.2.noarch.rpm"
RPM_HASH = "9dd123613d58ddb2ed590d0fac672a7b84de24c92adbb643d6b4535084ebea539182d37d296af4550d7587364900ff01c3554ea29ed968a6e5befcd8dc67e118"
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
