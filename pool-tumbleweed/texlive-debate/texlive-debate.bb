SUMMARY = "Debates between reviewers"
DESCRIPTION = "This package helps to organize debates between multiple \
reviewers of a paper within the text."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.1svn64846"

RPM_NAME = "texlive-debate-2023.201.0.0.2.1svn64846-52.1.noarch.rpm"
RPM_HASH = "4af9af33600f671eff8b33c88140b0d13165f73ce59ed51e4418507bf653a15c3549d6d78b221631f4b404b7464247b76e0107f5d38f190a51b9ade1c6df43bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-debate.sty \
texlive-debate"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-tcolorbox.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-listings \
texlive-listingsutf8 \
texlive-pdfcol \
texlive-scripts \
texlive-scripts-bin \
texlive-tcolorbox \
texlive-xcolor \
texlive-xkeyval"

inherit rpm
