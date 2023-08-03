SUMMARY = "A LaTeX class to typeset recipes"
DESCRIPTION = "The layout design is relatively straightforward (and \
traditional: see 'sample output' under 'documentation'); the \
class uses the Bookman and the BrushScript-Italic fonts."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.9svn54080"

RPM_NAME = "texlive-recipe-2023.209.0.0.9svn54080-54.1.noarch.rpm"
RPM_HASH = "bb962cd4fb5454349a854f5bfa231fbf7954953248014ab06d9686ae62209887a5c7882b6a6d6be2c172bc38c7228feab8d63089b62491574e2283ed543b52a1"
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
