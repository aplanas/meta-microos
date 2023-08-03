SUMMARY = "A package for typesetting epigraphs"
DESCRIPTION = "Epigraphs are the pithy quotations often found at the start (or \
end) of a chapter. Both single epigraphs and lists of epigraphs \
are catered for. Various aspects are easily configurable."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5esvn54857"

RPM_NAME = "texlive-epigraph-2023.209.1.5esvn54857-54.1.noarch.rpm"
RPM_HASH = "fdc3cace300f2eb1b6932dee45b26c5261a0be95e191b84a199138cd87076b4dc883e9876eba3760130bb5050fc83c350cc6d3c0ad7b46094da171da27c4f2fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-epigraph.sty \
texlive-epigraph"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-nextpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
