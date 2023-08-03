SUMMARY = "BibLaTeX styles for social sciences"
DESCRIPTION = "The bundle is a small collection of styles for BibLaTeX. It was \
designed for citations in the Humanities, following the \
guidelines of style of the institutes for the social sciences \
of the Leibniz University Hannover/LUH (especially the \
Institute of Political Science). The bundle depends on BibLaTeX \
(version 1.1 at least) and cannot be used without it."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn32180"

RPM_NAME = "texlive-biblatex-luh-ipw-2023.209.0.0.3svn32180-54.1.noarch.rpm"
RPM_HASH = "1109c9ee067525edea9f8f2d3d9116c269c2548e9880fce32f547dfc092d953b82ff345f5be50114d5a5c77d1bc8988a15080a8f48757fcd2fccf58c5d1f95ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-authoryear-luh-ipw.bbx \
tex-authoryear-luh-ipw.cbx \
tex-english-luh-ipw.lbx \
tex-german-luh-ipw.lbx \
tex-standard-luh-ipw.bbx \
tex-standard-luh-ipw.cbx \
tex-verbose-inote-luh-ipw.bbx \
tex-verbose-inote-luh-ipw.cbx \
texlive-biblatex-luh-ipw"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-authoryear-icomp.bbx \
tex-authoryear-icomp.cbx \
tex-verbose-inote.bbx \
tex-verbose-inote.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
