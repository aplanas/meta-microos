SUMMARY = "Aids for printing simple booklets"
DESCRIPTION = "Pages of a document processed with the booklet package will be \
reordered and scaled so that they can be printed as four pages \
per physical sheet of paper, two pages per side. The resulting \
sheets will, when folded in half, assemble into a booklet. \
Instructions on producing the manual itself as a booklet are \
included."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7bsvn15878"

RPM_NAME = "texlive-booklet-2023.201.0.0.7bsvn15878-52.1.noarch.rpm"
RPM_HASH = "90cf6fdbbc6a6c0605c564a194d235adff0de8b666e162033c65af330b26145ea3cbd2087977baf6b23ed77cb88052f15f270c92786087bb9900fe00465cc077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bkltprnt.sty \
tex-booklet.sty \
texlive-booklet"

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
