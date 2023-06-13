SUMMARY = "Drawing lenses and mirrors for optical diagrams"
DESCRIPTION = "This package provides some of macros for drawing simple lenses \
and mirrors for use in optical diagrams."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.1svn62977"

RPM_NAME = "texlive-simpleoptics-2023.201.1.1.1svn62977-53.1.noarch.rpm"
RPM_HASH = "8fac3ff9c05da895909e7dd77b3588848e5bd7f85907c4b14f2f0985f86c02d82f5e6f7581f42eea57d54e744c971ee6f18f117d579634592564dc871712d0d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(simpleoptics.sty) \
texlive-simpleoptics"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(tikz.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
