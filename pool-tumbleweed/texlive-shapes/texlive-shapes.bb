SUMMARY = "Draw polygons, reentrant stars, and fractions in circles with MetaPost"
DESCRIPTION = "The shapes set of macros allows drawing regular polygons; their \
corresponding reentrant stars in all their variations; and \
fractionally filled circles (useful for visually demonstrating \
the nature of fractions) in MetaPost."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn42428"

RPM_NAME = "texlive-shapes-2023.201.1.1svn42428-53.1.noarch.rpm"
RPM_HASH = "e1b88629c69a1d2a1bf6852cd38fc2f9f54cf23da1c505cde2d9e6d94cf0255dbb4b883e683941b14edee8d45d66db34938d5533afa466d2db1f4c39f63ecc20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shapes"

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
