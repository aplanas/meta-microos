SUMMARY = "A package for typesetting epigraphs"
DESCRIPTION = "Epigraphs are the pithy quotations often found at the start (or \
end) of a chapter. Both single epigraphs and lists of epigraphs \
are catered for. Various aspects are easily configurable."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5esvn54857"

RPM_NAME = "texlive-epigraph-2023.201.1.5esvn54857-53.2.noarch.rpm"
RPM_HASH = "8374a566adf47fa0da78a64668ae1859a351b4c58f84299d7bfaf6d3a9d3b4d713e2880230cf049afc397d70bc3ea74996f3a18b046dff79ff88a0d3849fe664"
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
