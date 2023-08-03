SUMMARY = "Vancouver style for BibLaTeX"
DESCRIPTION = "This package provides the Vancouver reference style for \
BibLaTeX. It is based on the numeric style and requires biber."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.1svn55339"

RPM_NAME = "texlive-biblatex-vancouver-2023.209.0.0.1svn55339-54.1.noarch.rpm"
RPM_HASH = "53e83abb0affe0b266ca39f3298dbca6e252fb28d8017dc0f3d4671f653a4680274b0c201ad2c2139517458babb85326f2df0ee4b2bf0b1fa52748c17125316c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-vancouver.bbx \
tex-vancouver.cbx \
texlive-biblatex-vancouver"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-numeric.bbx \
tex-numeric.cbx \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
