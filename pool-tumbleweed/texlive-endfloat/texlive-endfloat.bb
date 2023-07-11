SUMMARY = "Move floats to the end, leaving markers where they belong"
DESCRIPTION = "Place all floats on pages by themselves at the end of the \
document, optionally leaving markers like '[Figure 3 about \
here]' in the text near to where the figure (or table) would \
normally have occurred. Float types figure and table are \
recognised by the package, unmodified. Since several packages \
define other types of float, it is possible to register these \
float types with endfloat."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.7svn57090"

RPM_NAME = "texlive-endfloat-2023.201.2.7svn57090-53.2.noarch.rpm"
RPM_HASH = "aed42e83e86aa343e9065902087bfd123b37e5d8fdf4873641dc3eaee022b5d5b21be009a1389c5e8641251841566f7f8fa64fc98b405e62f6af755aa43fae23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-endfloat.sty \
texlive-endfloat"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
