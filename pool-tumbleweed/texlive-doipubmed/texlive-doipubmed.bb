SUMMARY = "Special commands for use in bibliographies"
DESCRIPTION = "The package provides the commands \\doi, \\pubmed and \\citeurl. \
These commands are primarily designed for use in \
bibliographies. A LaTeX2HTML style file is also provided."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn15878"

RPM_NAME = "texlive-doipubmed-2023.209.1.01svn15878-53.1.noarch.rpm"
RPM_HASH = "1ebe3b76117913da5c9c065add4df4e9484d3822f7ed0346fa5e7382ab43dcf8116a6f89e68abef095ec40e9f1aba6d060bd2a2fc5d5499c5088fdec26cd4181"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-doipubmed.sty \
texlive-doipubmed"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
