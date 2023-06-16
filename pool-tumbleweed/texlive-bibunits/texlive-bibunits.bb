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

PV = "2023.201.2.2svn15878"

RPM_NAME = "texlive-bibunits-2023.201.2.2svn15878-53.1.noarch.rpm"
RPM_HASH = "22a9556b06511427c96e94f8455f8e1f690c9720eda03a94367c55f511a8952f4eee4b8796630e0e8309c4b0ee89fae0c3ee79bfea891d52544ae1d757bbb86b"
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
