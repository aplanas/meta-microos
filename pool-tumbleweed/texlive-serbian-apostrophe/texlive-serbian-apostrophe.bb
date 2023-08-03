SUMMARY = "Commands for Serbian words with apostrophes"
DESCRIPTION = "The package provides a collection of commands (whose names are \
Serbian words) whose expansion is the Serbian word with \
appropriate apostrophes."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn23799"

RPM_NAME = "texlive-serbian-apostrophe-2023.209.svn23799-54.1.noarch.rpm"
RPM_HASH = "5e9bbed240102b17e649cf6779893e30db946a4ebf51c60dc25349d6328581ed23568d498f567732e40dfeda730f939108a89976a2a4823e63841833167a992f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-serbian-apostrophe.sty \
texlive-serbian-apostrophe"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tipa.sty \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
