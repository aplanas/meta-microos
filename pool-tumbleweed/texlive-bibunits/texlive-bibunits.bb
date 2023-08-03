SUMMARY = "Multiple bibliographies in one document"
DESCRIPTION = "The package provide a mechanism to generate separate \
bibliographies for different units (chapters, sections or \
bibunit-environments) of a text. The package separates the \
citations of each unit of text into a separate file to be \
processed by BibTeX. The global bibliography section produced \
by LaTeX may also appear in the document and citations can be \
placed in both the local unit and the global bibliographies at \
the same time. The package is compatible with koma-script and \
with the babel French option frenchb."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn15878"

RPM_NAME = "texlive-bibunits-2023.209.2.2svn15878-54.1.noarch.rpm"
RPM_HASH = "365a03096cf013597bca51fb8126af04f6a7b2a50bfda229c1c9902d6218d6ff37e9d1c9c39dfcf654acbcb24beb82e82e5a303e8a23112e1707c8a61be91e88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibunits.sty \
texlive-bibunits"

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
