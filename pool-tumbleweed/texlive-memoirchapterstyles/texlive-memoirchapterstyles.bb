SUMMARY = "Chapter styles in memoir class"
DESCRIPTION = "A showcase of chapter styles available to users of memoir: the \
six provided in the class itself, plus many from elsewhere (by \
the present author and others). The package's resources apply \
only to memoir, but the package draws from a number of sources \
relating to standard classes, including the fncychap package, \
and Vincent Zoonekynd's tutorial on headings."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.7esvn59766"

RPM_NAME = "texlive-memoirchapterstyles-2023.208.1.7esvn59766-53.1.noarch.rpm"
RPM_HASH = "a6ac0ef07864b7e1ee129599dd17902d2a85a8562c625c7fb4a1eb60bab7e95552a1a0513852b34e105961dc638e52429e08c6e5f4fd3cc524857babac2ed254"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-memoirchapterstyles"

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
