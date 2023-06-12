SUMMARY = "Chapter styles in memoir class"
DESCRIPTION = "A showcase of chapter styles available to users of memoir: the \
six provided in the class itself, plus many from elsewhere (by \
the present author and others). The package's resources apply \
only to memoir, but the package draws from a number of sources \
relating to standard classes, including the fncychap package, \
and Vincent Zoonekynd's tutorial on headings."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7esvn59766"

RPM_NAME = "texlive-memoirchapterstyles-2023.201.1.7esvn59766-52.1.noarch.rpm"
RPM_HASH = "2f964ac36a6e17bec71c79515330ac5639e0b9fedd83112a6373ee6a05e6e25df74e96f4b99d1b8c53aad145ce53a8eb120cd7db4ce18736d8a289c8d3e4f76e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-memoirchapterstyles"
RDEPENDS:${PN} += "/bin/sh \
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
