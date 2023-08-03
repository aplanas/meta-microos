SUMMARY = "Placement of background material on pages of a document"
DESCRIPTION = "The package offers the placement of background material on the \
pages of a document. The user can control many aspects \
(contents, position, color, opacity) of the background material \
that will be displayed; all placement and attribute settings \
are controlled by setting key values. The package makes use of \
the everypage package, and uses pgf/tikz for attribute control."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn42428"

RPM_NAME = "texlive-background-2023.209.2.1svn42428-54.1.noarch.rpm"
RPM_HASH = "051d4641c23c54c95a902599e3390edda9aec5faa85e2929e0f3b70948ab0befeb312d55a3141ab6261ac2fe2a3d2129212f2f618b45cbbcc378fb8629f9bd66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-background.sty \
texlive-background"

RDEPENDS:${PN} += "/usr/bin/sh \
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
