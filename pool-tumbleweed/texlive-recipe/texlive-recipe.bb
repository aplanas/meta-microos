SUMMARY = "A LaTeX class to typeset recipes"
DESCRIPTION = "The layout design is relatively straightforward (and \
traditional: see 'sample output' under 'documentation'); the \
class uses the Bookman and the BrushScript-Italic fonts."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.9svn54080"

RPM_NAME = "texlive-recipe-2023.201.0.0.9svn54080-53.2.noarch.rpm"
RPM_HASH = "25e4223807370cf93a23c9f55ac7265df3eb849f1f2ed08f23e311917787593056248d5d6b31320bd0c4225ad4410b1b7add72d8d212181e1a1f344917d903bc"
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
