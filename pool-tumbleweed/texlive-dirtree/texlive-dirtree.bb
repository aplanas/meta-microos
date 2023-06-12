SUMMARY = "Display trees in the style of windows explorer"
DESCRIPTION = "This package is designed to emulate the way windows explorer \
displays directory and file trees, with the root at top left, \
and each level of subtree displaying one step in to the right. \
The macros work equally well with Plain TeX and with LaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.32svn42428"

RPM_NAME = "texlive-dirtree-2023.201.0.0.32svn42428-52.1.noarch.rpm"
RPM_HASH = "b6688a23d0567ba4690c13af5a89e86d10482079362d4d1c9f7ad7c818191b452686af66ea5ffb42c143bb1f26204353ceaacd3f092b9f64652a510bf4421bbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dirtree.sty) \
tex(dirtree.tex) \
texlive-dirtree"
RDEPENDS:${PN} += "/bin/sh \
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
