SUMMARY = "A BibTeX style for the journal Zootaxa"
DESCRIPTION = "This package provides a .bst reference style file for the \
journal Zootaxa that publishes contributions in zoology and \
classification. This is a fork of apa.bst as provided by TeX \
Live since this style file resembled the most Zootaxa's own \
style. Further modifications were made to the code in order to \
generate in-text citations and bibliography sections \
appropriately."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn50619"

RPM_NAME = "texlive-zootaxa-bst-2023.209.1.0svn50619-53.1.noarch.rpm"
RPM_HASH = "59e789955826aaf784c061d3e7a331d2b723f6ed21713a424601aa2d680425c55fe0989ca0080d24150b0fcfd667b0def864eab924638c6a9e17622cb30989df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zootaxa-bst"

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
