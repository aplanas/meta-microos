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

PV = "2023.209.1.3esvn42287"

RPM_NAME = "texlive-imakeidx-2023.209.1.3esvn42287-54.1.noarch.rpm"
RPM_HASH = "c11a25ce88d8cdfe50c92be5d937f254053a2a64bc800575d08fbb09253b954b967f4d33be7f6464f56c099a2b5e73b884757cca837b5cc789156b6e44ae4110"
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
