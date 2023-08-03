SUMMARY = "Control sectional headers"
DESCRIPTION = "A LaTeX2e package to help change the style of any or all of \
LaTeX's sectional headers in the article, book, or report \
classes. Examples include the addition of rules above or below \
a section title."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.2svn15878"

RPM_NAME = "texlive-sectsty-2023.209.2.0.2svn15878-54.1.noarch.rpm"
RPM_HASH = "8fad74c7b8ac0db9576e576b4b6e7e268654ae238dda0c58f95cde27cddc20d579abd950570de83a535f597f045d7e66963783388377ebc6407af09d7b0c7a19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sectsty.sty \
texlive-sectsty"

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
