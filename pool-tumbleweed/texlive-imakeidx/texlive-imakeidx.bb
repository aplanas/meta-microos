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

PV = "2023.208.1.3esvn42287"

RPM_NAME = "texlive-imakeidx-2023.208.1.3esvn42287-53.1.noarch.rpm"
RPM_HASH = "7038f7c33732813ac6fed009139aed78d20ee20d2d83c4fc98fa676bc643afdf4b66ed3758b43d2a982b142b28a6cdc878acb482c3de79d9823fc264920e1f34"
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
