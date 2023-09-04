SUMMARY = "A LaTeX class to typeset recipes"
DESCRIPTION = "The layout design is relatively straightforward (and \
traditional: see 'sample output' under 'documentation'); the \
class uses the Bookman and the BrushScript-Italic fonts."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.9svn54080"

RPM_NAME = "texlive-recipe-2023.209.0.0.9svn54080-54.2.noarch.rpm"
RPM_HASH = "1a3439112a840a753121af1ff3e2a60b2c86beafb3d4b3cc7cfb6809ece5a641322d3697e9d89d6c12be8237c8905fe9658cb3ff8c909f5e3c9dfc93f2d13f6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-recipe.cls \
texlive-recipe"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
