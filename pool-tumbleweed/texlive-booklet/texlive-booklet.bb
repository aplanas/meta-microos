SUMMARY = "Aids for printing simple booklets"
DESCRIPTION = "Pages of a document processed with the booklet package will be \
reordered and scaled so that they can be printed as four pages \
per physical sheet of paper, two pages per side. The resulting \
sheets will, when folded in half, assemble into a booklet. \
Instructions on producing the manual itself as a booklet are \
included."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7bsvn15878"

RPM_NAME = "texlive-booklet-2023.209.0.0.7bsvn15878-53.1.noarch.rpm"
RPM_HASH = "63fdac94229e38e9c5961d6f2f84f48a9d3cb227b37e71a21207897f38c78bb9695990ab465474ccc16e127db6433bf149fa9a19a8215f43c4e702a0fdfd33cc"
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
