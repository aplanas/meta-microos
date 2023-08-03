SUMMARY = "A bundle of packages provided 'as is'"
DESCRIPTION = "The bundle comprises: authblk, which permits footnote style \
author/affiliation input in the \\author command, balance, to \
balance the end of \\twocolumn pages, figcaps, to send figure \
captions, etc., to end document, fullpage, to set narrow page \
margins and set a fixed page style, and sublabel, which permits \
counters to be subnumbered."
LICENSE = "LPPL-1.0"

PV = "2023.209.2011svn30447"

RPM_NAME = "texlive-preprint-2023.209.2011svn30447-53.1.noarch.rpm"
RPM_HASH = "55c055fd3be71bcb38bc6c36af17d4fb86b664ce7f3adf16891bc0e310752592072c23273967bbf31e01abc67d505d5613b17826e82cb2d6ece8f73ce5ef62e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-authblk.sty \
tex-balance.sty \
tex-figcaps.sty \
tex-fullpage.sty \
tex-sublabel.sty \
texlive-preprint"

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
