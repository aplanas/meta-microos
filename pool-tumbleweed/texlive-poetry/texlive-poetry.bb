SUMMARY = "Facilities for typesetting poetry and poetical structure"
DESCRIPTION = "This package provides some macros and general doodads for \
typesetting poetry. There is, of course, already the excellent \
verse package, and the poetrytex package provides some extra \
functionality on top of it. But poetry provides much of the \
same functionality in a bit of a different way, and with a few \
additional abilities, such as facilities for a list of poems, \
an index of first lines, and some structural commands."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn53129"

RPM_NAME = "texlive-poetry-2023.209.2.2svn53129-53.1.noarch.rpm"
RPM_HASH = "d9b6633dc5d181556aae9fa42cc61fe65c3304a0cbf388ca84ca99b0b55daa76a2331a11bfb72bffc77b54f30d230abdb85067e55c3b9e049b853a2025ae4ee9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-poetry.sty \
texlive-poetry"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-imakeidx.sty \
tex-modulus.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
