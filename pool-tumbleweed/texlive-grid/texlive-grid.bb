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

PV = "2023.209.1.0svn61719"

RPM_NAME = "texlive-grid-2023.209.1.0svn61719-54.2.noarch.rpm"
RPM_HASH = "48bba75ebf650907b31d611bf20b16fdbd23f2393e84c0cbbd0ad69f756472220ab32d178fe20a5484dbc0666db041272045d23ba6da2c7547a05c34919dc741"
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
