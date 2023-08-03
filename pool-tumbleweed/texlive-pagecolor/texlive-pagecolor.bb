SUMMARY = "Interrogate page color"
DESCRIPTION = "This package provides the command \\thepagecolor, which gives \
the current page (background) color, i. e. the argument used \
with the most recent call of \\pagecolor{...}. The command \
\\thepagecolornone gives the same color as \\thepagecolor, except \
when the page background color is 'none' (e.g., as a result of \
using the \\nopagecolor command). In that case \\thepagecolor is \
'white' and \\thepagecolornone is 'none'. When \\nopagecolor is \
unknown or broken (crop package), this package provides a \
replacement. Similar to \\newgeometry and \\restoregeometry of \
the geometry package \\newpagecolor{...} and \\restorepagecolor \
are provided. For use with the crop package \
\\backgroundpagecolor{...} as well as \
\\newbackgroundpagecolor{...} and \\restorebackgroundpagecolor \
are provided."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2bsvn65843"

RPM_NAME = "texlive-pagecolor-2023.209.1.2bsvn65843-52.1.noarch.rpm"
RPM_HASH = "9873979da896172d3bb5d6dcfd399eefda2776298d4da0b8db377ee4f9006e08a96102fda83f37cba2b0cc8d751189ad5dd278bccc17d375427d32dc83d5782b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pagecolor.sty \
texlive-pagecolor"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-hardwrap.sty \
tex-kvoptions.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
