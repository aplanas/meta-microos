SUMMARY = "SPIE Optical Engineering and OE Letters manuscript template"
DESCRIPTION = "With this template, and associated style and LaTeX packages, it \
is possible to estimate the page length of manuscripts for \
submission to the SPIE journals 'Optical Engineering' and \
'Optical Engineering Letters'. With a strict three-page limit, \
this is particularly important for the latter. The template \
gives simple instructions on how to prepare the manuscript."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn27331"

RPM_NAME = "texlive-opteng-2023.201.1.0svn27331-54.1.noarch.rpm"
RPM_HASH = "d35a4382461ae79ce0420092c8bb223dfece69217b4f43b5d742277efac4fdc7d7b6fcb3a1aedb13a2b43525172d76a94b0eb71999f9e27a67fed7523205e4ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(opteng.sty) \
texlive-opteng"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amsmath.sty) \
tex(fancybox.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(overcite.sty) \
tex(pstricks.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
