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

PV = "2023.201.1.2bsvn65843"

RPM_NAME = "texlive-pagecolor-2023.201.1.2bsvn65843-51.1.noarch.rpm"
RPM_HASH = "650b25908064c6addca177fb5faceeb616ce3d19468260f9d19d669c0eb53ed6361427d16100fb6eebc8f4e82b9003dc292295199e3eac3babe3c84b7e4281ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pagecolor.sty) \
texlive-pagecolor"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(color.sty) \
tex(hardwrap.sty) \
tex(kvoptions.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
