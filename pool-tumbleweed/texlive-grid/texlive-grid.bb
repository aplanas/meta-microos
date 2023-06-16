SUMMARY = "Grid typesetting in LaTeX"
DESCRIPTION = "The package helps to enables grid typesetting in double column \
documents. Grid typesetting (vertical aligning of lines of text \
in adjacent columns) is a difficult task in LaTeX, and the \
present package is no more than an attempt to help users to \
achieve it in a limited way. An example document, grid.tex, is \
provided with simple instructions to typeset it using the \
package. The package needs a lot more work: this is only a \
beginning..."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn61719"

RPM_NAME = "texlive-grid-2023.201.1.0svn61719-53.1.noarch.rpm"
RPM_HASH = "a09fdc19e50acfdc1cac781d6fac760b0dcfd3ec5e9ad17afdbd4c540c927fac5297407ea4978ac18efca85726c2a0395884afbfc3294715053c6db3134bc18c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grid.sty \
texlive-grid"

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
