SUMMARY = "Print two virtual pages on each physical page"
DESCRIPTION = "MiKTeX and many other TeX implementations include tools for \
massaging PostScript into booklet and two-up printing -- that \
is, printing two logical pages side by side on one side of one \
sheet of paper. However, some LaTeX preliminaries are necessary \
to use those tools. The twoup package provides such \
preliminaries and gives advice on how to use the PostScript \
tools."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn15878"

RPM_NAME = "texlive-twoup-2023.209.1.3svn15878-53.1.noarch.rpm"
RPM_HASH = "f09e6425d300410036383296bde9d93d7bbfe60599a9b68f7bbc8cf4990a6b0d43cab07b307de3f1f251b467353079b08bdafb0fefd6d9084b2432b5a63b551c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-twoup.sty \
texlive-twoup"

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
