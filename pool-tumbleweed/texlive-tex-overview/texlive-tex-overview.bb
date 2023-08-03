SUMMARY = "An overview of the development of TeX"
DESCRIPTION = "The document gives a short overview of TeX and its children, as \
well as the macro packages LaTeX and ConTeXt."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn41403"

RPM_NAME = "texlive-tex-overview-2023.209.0.0.2svn41403-55.1.noarch.rpm"
RPM_HASH = "b9860e0bd351f41e7daa162d32c72533c7b3ab5fb4b6a631dade42f5cb63b4c1c8e0881eccaa24d6c1dd2571d266507c7db86a2bc01972d40c1c7e33785762e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tex-overview"

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
