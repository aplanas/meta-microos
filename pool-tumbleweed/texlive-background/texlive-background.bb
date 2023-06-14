SUMMARY = "Placement of background material on pages of a document"
DESCRIPTION = "The package offers the placement of background material on the \
pages of a document. The user can control many aspects \
(contents, position, color, opacity) of the background material \
that will be displayed; all placement and attribute settings \
are controlled by setting key values. The package makes use of \
the everypage package, and uses pgf/tikz for attribute control."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn42428"

RPM_NAME = "texlive-background-2023.201.2.1svn42428-53.1.noarch.rpm"
RPM_HASH = "123da4e553d4a618da2867794f73f68592733c93b1c72ab5b37e870e6a7dd5d7c00054e6210e4092435fe6728a92818bbe5b4a3cfd202efc9f2e8d7d9dfd9ae7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-background.sty \
texlive-background"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-afterpage.sty \
tex-everypage.sty \
tex-tikz.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
