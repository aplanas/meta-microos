SUMMARY = "Support screen-based document design"
DESCRIPTION = "An extension of the hyperref package to provide a screen-based \
document design. This package helps to generate pdf documents \
that are readable on screen and will fit the screen's aspect \
ratio. Also it can be used with various options to produce \
regular print versions of the same document without any extra \
effort."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn42428"

RPM_NAME = "texlive-pdfscreen-2023.209.1.5svn42428-52.1.noarch.rpm"
RPM_HASH = "6a155ab0fd71fc56fb52af687a590d85a657b4306ab65e5ef062052f66b5feb3b6e68a0d5b15afd49db1cac657d5aa8b3727c08d95a9e5b5a360e6d9e487b825"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfscreen.sty \
texlive-pdfscreen"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsbsy.sty \
tex-amssymb.sty \
tex-calc.sty \
tex-color.sty \
tex-comment.sty \
tex-fancybox.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-shortvrb.sty \
tex-truncate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
