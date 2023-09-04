SUMMARY = "A package for typesetting epigraphs"
DESCRIPTION = "Epigraphs are the pithy quotations often found at the start (or \
end) of a chapter. Both single epigraphs and lists of epigraphs \
are catered for. Various aspects are easily configurable."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5esvn54857"

RPM_NAME = "texlive-epigraph-2023.209.1.5esvn54857-54.2.noarch.rpm"
RPM_HASH = "de0f2495cd531919281e2d2bf9b34669b2d80367d257140e6d2c6a82ffdbf16193f075052b00d03716a484e5c12775669f4bd93877e220d1fd5f0a5d40d667f8"
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
