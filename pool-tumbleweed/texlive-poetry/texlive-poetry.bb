SUMMARY = "Facilities for typesetting poetry and poetical structure"
DESCRIPTION = "This package provides some macros and general doodads for \
typesetting poetry. There is, of course, already the excellent \
verse package, and the poetrytex package provides some extra \
functionality on top of it. But poetry provides much of the \
same functionality in a bit of a different way, and with a few \
additional abilities, such as facilities for a list of poems, \
an index of first lines, and some structural commands."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn53129"

RPM_NAME = "texlive-poetry-2023.201.2.2svn53129-52.1.noarch.rpm"
RPM_HASH = "c4bed0f7fc92f477a286c4b9e9d05a9b7ccb2b5b6e7821d83a6be98369096360696aec0f5f7caea9c32395f6d0853e331f9d1419b79c3b43b7bc4229d00fd0a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(poetry.sty) \
texlive-poetry"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(imakeidx.sty) \
tex(modulus.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
