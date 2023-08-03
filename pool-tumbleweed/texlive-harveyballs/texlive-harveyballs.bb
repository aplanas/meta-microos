SUMMARY = "Create Harvey Balls using TikZ"
DESCRIPTION = "The package provides 5 commands (giving symbols that indicate \
values from 'none' to 'full')."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn32003"

RPM_NAME = "texlive-harveyballs-2023.209.1.1svn32003-54.1.noarch.rpm"
RPM_HASH = "b54abcc67ca665dde0773adda1df41ed44e17ba458b4e42d1d015783c43b74478ccc2cb4ea8684c1c16918b1ecc9cfe1f279e1168d78227bc0ac9e6bb5a24eef"
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
