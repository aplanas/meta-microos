SUMMARY = "Extend the applicability of the \\footnote command"
DESCRIPTION = "The package treats footnotes in \\caption, the tabular \
environment, and \\chapter and other \\section-like commands."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn29652"

RPM_NAME = "texlive-ftnxtra-2023.209.0.0.1svn29652-53.1.noarch.rpm"
RPM_HASH = "64809fccabba97a9bd93c283807a45a9f1dae722bf990ef866e5de912baa033b2d0fd3e9c42217b15f3d9623c4b978ae12309786485b2ca9120d78e9f4f7ac0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ftnxtra.sty \
texlive-ftnxtra"

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
