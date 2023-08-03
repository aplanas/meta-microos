SUMMARY = "Draw polygons, reentrant stars, and fractions in circles with MetaPost"
DESCRIPTION = "The shapes set of macros allows drawing regular polygons; their \
corresponding reentrant stars in all their variations; and \
fractionally filled circles (useful for visually demonstrating \
the nature of fractions) in MetaPost."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn42428"

RPM_NAME = "texlive-shapes-2023.209.1.1svn42428-54.1.noarch.rpm"
RPM_HASH = "2ece9c39ac62bc91a9164ae4fd62e08801c4f8bf835bfb046006027bbf314f7475e7c78c2a2e8a156dce0dc34eff4f0c8e51843e3049c0c5b0b68c71917a9027"
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
