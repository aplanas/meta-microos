SUMMARY = "Commands for Serbian words with apostrophes"
DESCRIPTION = "The package provides a collection of commands (whose names are \
Serbian words) whose expansion is the Serbian word with \
appropriate apostrophes."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn23799"

RPM_NAME = "texlive-serbian-apostrophe-2023.201.svn23799-53.1.noarch.rpm"
RPM_HASH = "198d8b182bf59b23346fc9268aa315bf83ea7c9ed517014f76943f9175dad87fbf8aef4b19e259cd4be832e1319a6ecd13bb1538d5fd0ca74a9f372a6b46a69e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(serbian-apostrophe.sty) \
texlive-serbian-apostrophe"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tipa.sty) \
tex(xspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
