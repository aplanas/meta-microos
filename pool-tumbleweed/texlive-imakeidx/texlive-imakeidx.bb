SUMMARY = "A package for producing multiple indexes"
DESCRIPTION = "The package enables the user to produce and typeset one or more \
indexes simultaneously with a document. The package is known to \
work in LaTeX documents processed with pdfLaTeX, XeLaTeX and \
LuaLaTeX. If makeindex is used for processing the index \
entries, no particular setting up is needed when TeX Live is \
used. Using xindy or other programs it is necessary to enable \
shell escape; shell escape is also needed if splitindex is \
used."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3esvn42287"

RPM_NAME = "texlive-imakeidx-2023.201.1.3esvn42287-52.1.noarch.rpm"
RPM_HASH = "9707ffddb9c4afba9d130c76fc91b0b5055c753d4e5144437949245eb44e3fd59163b2c084b0c9f1855b01cf45ce3efc351cefc8f000419230a172e5deeb1901"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-imakeidx.sty \
texlive-imakeidx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-multicol.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
