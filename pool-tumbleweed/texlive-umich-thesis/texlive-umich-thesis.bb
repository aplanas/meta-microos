SUMMARY = "University of Michigan Thesis LaTeX class"
DESCRIPTION = "A LaTeX2e class to create a University of Michigan dissertation \
according to the Rackham dissertation handbook."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.20svn15878"

RPM_NAME = "texlive-umich-thesis-2023.201.1.20svn15878-53.1.noarch.rpm"
RPM_HASH = "48f46c6d387b27d6d71ef618fea0f10bf075947b248dedee481dd9f405587d6f23fdf62c2942b1f79a968b653e7e5e1a0e8a2477782585aa12a60a8d0b9ed05b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(umich-thesis.cls) \
texlive-umich-thesis"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(book.cls) \
tex(geometry.sty) \
tex(placeins.sty) \
tex(setspace.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
