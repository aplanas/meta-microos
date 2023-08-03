SUMMARY = "SPIE Optical Engineering and OE Letters manuscript template"
DESCRIPTION = "With this template, and associated style and LaTeX packages, it \
is possible to estimate the page length of manuscripts for \
submission to the SPIE journals 'Optical Engineering' and \
'Optical Engineering Letters'. With a strict three-page limit, \
this is particularly important for the latter. The template \
gives simple instructions on how to prepare the manuscript."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn27331"

RPM_NAME = "texlive-opteng-2023.209.1.0svn27331-55.1.noarch.rpm"
RPM_HASH = "2ee2f11f3c2cba15caf7bffdddd5ff00cff5f4850919e46b20223d1b28541d5232e3439af1aeefe1c16ef1b0019718b46be7633443eb3ac2f2dc3f4efbe3109d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-opteng.sty \
texlive-opteng"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-fancybox.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-overcite.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
