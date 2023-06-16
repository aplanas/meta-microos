SUMMARY = "Import TikZ images from colletions"
DESCRIPTION = "The package addresses the problem of importing only one \
TikZ-image from a file holding multiple images."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn28715"

RPM_NAME = "texlive-tikzinclude-2023.201.1.0svn28715-52.1.noarch.rpm"
RPM_HASH = "fe04405affc35eda07628d4da0c6acb1b28ab5aec5ddccf764f66739f7fc19dd6c9a267a3330404e9421354e87ddb15732f0d78575ddcbf95a2077c6ffe73595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzinclude.sty \
texlive-tikzinclude"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-ifthen.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
