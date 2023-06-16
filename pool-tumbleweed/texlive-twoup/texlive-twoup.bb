SUMMARY = "Print two virtual pages on each physical page"
DESCRIPTION = "MiKTeX and many other TeX implementations include tools for \
massaging PostScript into booklet and two-up printing -- that \
is, printing two logical pages side by side on one side of one \
sheet of paper. However, some LaTeX preliminaries are necessary \
to use those tools. The twoup package provides such \
preliminaries and gives advice on how to use the PostScript \
tools."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn15878"

RPM_NAME = "texlive-twoup-2023.201.1.3svn15878-52.1.noarch.rpm"
RPM_HASH = "bb67b83f9a8bfc33e7683e8741aa0ba09b96b3cbaa57fdfe2383f27e5a3621c6e04367c8f20f792e08be297e50d6bb32ce143a4f3db7b527553e6127f2e0fa30"
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
